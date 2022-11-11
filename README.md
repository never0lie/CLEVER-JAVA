# ECE 382V Project: CLEVER-JAVA
### Introduction

This is the repository of the graduate course ECE 382V at University of Texas at Austin. In this project, we are going to transfer the algorithm mentioned in the paper [Client-Specific Equivalence Checking](https://people.ece.ubc.ca/mjulia/publications/Client_Specific_Equivalence_Checking_2018.pdf) from Python implementation to Java.

### Solution

The original paper is based on two weight-lifting libraries, [PyExZ3](https://github.com/thomasjball/PyExZ3) (for dynamic symbolic execution in Python) and [PySMT](https://github.com/pysmt/pysmt) (for solving symbolic modulo theory). Corresponding to these two Python libraries, we will implement the framework based on Java libraries. For example, [jpf-shadow](https://github.com/hub-se/jpf-shadow).

### How to Install and Run

- Git clone the whole project. 

- Execute the `install.sh` script to tell JPF the paths of all extensions. 

- Create the Symbolic Execution Parameter object in class `SymExParameter_JPF`, and pass the arguments of the client to this object. 

  For example: 

  ```java
  public static final SymExParameter IsBigger = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
              "${jpf-shadow}/src/examples", "jpf2019.isbigger", "IsBigger", "isBigger", "isBigger(con#con)", 1, "",
              "evaluation-results/04_ISBIGGER_JPF/shadow-results/", null);
  ```

- Import the `SymExParameter` to the main function of the jpf-shashow. 

  ```java
  public class RunnerShadow_JPF {
  	public static void main(String[] args) throws IOException,ClassNotFoundException {
          System.out.println(">> Started Runner for jpf-shadow ...");
          
          SymExParameter[] subjects = {
          	SymExParameter_JPF.IsBigger
          };
      
          try {
              runExperiments(subjects);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      ...
  }
  ```

- Build the project with Ant and execute the experiment example. 

  ```bash
  cd jpf-shadow
  ant clean
  ant
  cd ..
  java -cp "jpf-shadow/build/*:jpf-core/build/*:jpf-symbc/build/*:jpf-symbc/lib/*" gov.nasa.jpf.shadow.RunnerShadow_JPF
  ```

- The experiment results would be stored in `/evaluation-results/`. 

### Updated in Nov 11, 2022 (Results for Phase 3)

- More translated examples. 
- We figured out how to do CSE checking for clients that pass in concrete values. 
- Thoughts on doing CSE checking for clients pass in variables. 

Below is one of the experiment result of client passing concrete values to the libraries, where two libraries are proved CSE. The change of the library is exchanging the location of `a` and `b`. 

```java
package jpf2019.add;

class Add_1c {
	int change(Integer oldVal,Integer newVal) {return oldVal;}
	boolean change(boolean oldVal, boolean newVal) {return oldVal;}

	int add(Integer a, Integer b) {

   	Integer c = change(a + b, b + a);
   	return c;

	}

	public static void main(String[] args) {
    	(new Add_1c()).add(5, 900);
	}
}



```

The result from jpf-shadow is at **/evaluation-results/\***, which I would paste it here:

```
====================================================== system under test
jpf2019.add.Add_1c.main()

====================================================== Method Summaries
Inputs: a_CONCRETE,,b_CONCRETE,
No path conditions for jpf2019.add.Add_1c.add(java.lang.Integer@1e5,java.lang.Integer@260)
Paths explored: 1

====================================================== results
no errors detected

...

PathCondition: FALSE
```

### Updated in Oct 28, 2022 (Results for Phase 2)

- Create a new repository to store all the experiment results and implementation.
- Translate some examples from CLEVER by combining the original file and upgraded file into one change file.
- Upload several examples in jpf-shadow module.

Below is one of the examples of the translated from Python to Java, as well as the result after we run it with jpf-shadow

##### [GetSign](jpf-shadow/src/examples/jpf2019/getsign/GetSign_1c.java)

```Java
package jpf2019.getsign;

public class GetSign_1c {
    public boolean change(boolean oldVal, boolean newVal) {
        return oldVal;
    }

    public int lib(int x) {
        // this change function is the backbone of jpf-shadow, 
        // as it records how the old version and new version 
        // of the library should be like
        if (change(x == 0, false)) {
            return 0;
        }

        if (change(x < 0, x <= 0)) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        (new GetSign_1c()).lib(2);
    }
}

/*
orig in Python:

def lib(x):
    if x == 0:
        return 0
    elif x < 0:
        return -1
    else:
        return 1

def getSign(x):
    return lib(x)

 */

/*
upgr in Python:

def lib(x):
    if x <= 0:
        return -1
    else:
        return 1

def getSign(x):
    return lib(x)

 */
```
[Here](evaluation-results/05_GETSIGN_JPF/shadow-results/log-jpf2019.getsign.GetSign_1c.txt) is the result after we run it with jpf-shadow.
As described in method summaries, jpf-shadow discovered that the change in the new
version of the code generated a path difference with the same client input 0.
```txt
symbolic.min_int=-100
symbolic.min_long=-9223372036854775808
symbolic.min_short=-32768
symbolic.min_byte=-128
symbolic.min_char=0
symbolic.max_int=100
symbolic.max_long=9223372036854775807
symbolic.max_short=32767
symbolic.max_byte=127
symbolic.max_char=65535
symbolic.min_double=-100.0
symbolic.max_double=100.0
JavaPathfinder core system v8.0 - (C) 2005-2014 United States Government. All rights reserved.


====================================================== system under test
jpf2019.getsign.GetSign_1c.main()

====================================================== search started: 10/28/22 11:30 PM

====================================================== Method Summaries
Inputs: x

jpf2019.getsign.GetSign_1c.lib(0)	--> Diff in line: 9, Type: diffFalse	(Return Value: -1)
Paths explored: 2

====================================================== results
no errors detected

====================================================== statistics
elapsed time:       00:00:00
states:             new=18,visited=0,backtracked=18,end=2
search:             maxDepth=8,constraints=0
choice generators:  thread=1 (signal=0,lock=1,sharedRef=0,threadApi=0,reschedule=0), data=11
heap:               new=347,released=22,maxLive=345,gcCycles=7
instructions:       3169
max memory:         121MB
loaded code:        classes=60,methods=1281

====================================================== search finished: 10/28/22 11:30 PM
classpath=${jpf-shadow}/build/jpf-shadow.jar
sourcepath=${jpf-shadow}/src/examples
package=jpf2019.getsign
class=GetSign_1c
method=lib(sym)


METHOD_END; SAT = true
x=0
constraint # = 4
x <= 0 &&
1 != 0 &&
0 = 0 &&
x = 0


#PROPERTY_VIOLATED = 0
#Total = 1

```
[Here](jpf-shadow/src/main/gov/nasa/jpf/shadow/SymExParameter_JPF.java#L12-L14) is the configuration that is essential to `executeShadowSymbolicExecutionForMethod` for running this experiment

```Java
 public static final SymExParameter GetSign = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
            "${jpf-shadow}/src/examples", "jpf2019.getsign", "GetSign", "lib", "lib(sym)", 1, "",
            "evaluation-results/05_GETSIGN_JPF/shadow-results/", null);
```

### Maintainers

- [Sizhan Xu](https://github.com/never0lie): CS @ UT-Austin
- [Erjian Gao](https://github.com/ErjianGao): ECE @ UT-Austin

### Citations

This project is based on the following projects:
- [Client-Specific Equivalence Checking](https://github.com/Client-Specific-Equivalence-Checker/CLEVER)
- [Complete Shadow Symbolic Execution with Java PathFinder](https://github.com/hub-se/jpf-shadow-plus)