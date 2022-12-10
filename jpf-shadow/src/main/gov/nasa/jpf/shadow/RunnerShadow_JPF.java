package gov.nasa.jpf.shadow;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.ObjectInputFilter.Config;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.Base64;
import java.util.Map;
import java.util.Set;

import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFConfigException;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.shadow.MyPathCondition.PathResultType;
import gov.nasa.jpf.symbc.SymbolicListener;
import gov.nasa.jpf.Config;

/**
 * Experiment execution class.
 *
 */
public class RunnerShadow_JPF {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        System.out.println(">> Started Runner for jpf-shadow ...");

        SymExParameter[] subjects = {
          // SymExParameter_JPF.Loopunreach355_EQ,
          // SymExParameter_JPF.Loopmult2_EQ,
          // SymExParameter_JPF.Loopmult5_EQ,
          // SymExParameter_JPF.Loopmult10_EQ,
          // SymExParameter_JPF.Loopmult15_EQ,
          // SymExParameter_JPF.Loopmult20_EQ,
          // SymExParameter_JPF.Loopmult25_EQ,
          // SymExParameter_JPF.Loopmult30_EQ,
          // SymExParameter_JPF.Loopmult40_EQ,
          // SymExParameter_JPF.Loopmult55_EQ,
          // SymExParameter_JPF.Loopmult75_EQ,
          // SymExParameter_JPF.Loopmult100_EQ,
          // SymExParameter_JPF.Loopmult130_EQ,
          // SymExParameter_JPF.Loopmult165_EQ,
          // SymExParameter_JPF.Loopmult205_EQ,
          // SymExParameter_JPF.Loopmult250_EQ,
          // SymExParameter_JPF.Loopmult300_EQ,
          // SymExParameter_JPF.Loopmult355_EQ,
          // SymExParameter_JPF.Loopmult415_EQ,
          // SymExParameter_JPF.Loopmult480_EQ,
          // SymExParameter_JPF.Loopmult550_EQ,
          // SymExParameter_JPF.Loopmult625_EQ,
          // SymExParameter_JPF.Loopmult705_EQ,
          // SymExParameter_JPF.Loopmult790_EQ,
          // SymExParameter_JPF.Loopmult880_EQ,
          // SymExParameter_JPF.Loopunreach2_EQ,
          // SymExParameter_JPF.Loopunreach5_EQ,
          // SymExParameter_JPF.Loopunreach10_EQ,
          // SymExParameter_JPF.Loopunreach15_EQ,
          SymExParameter_JPF.Loopunreach20_EQ,
          // SymExParameter_JPF.Loopunreach25_EQ,
          // SymExParameter_JPF.One_EQ,
          // SymExParameter_JPF.Loopunreach75_EQ,
          
          
          // SymExParameter_JPF.Onebound_EQ,
          // SymExParameter_JPF.Multiplebound_EQ,
          
         
          // SymExParameter_JPF.Divide_EQ,
          
          
          // SymExParameter_JPF.Unchloop_EQ,
          
          
          // SymExParameter_JPF.Loopunreach250_EQ,
          // SymExParameter_JPF.Is_prime2_EQ,
          
          
          // SymExParameter_JPF.Pos_EQ,
          // SymExParameter_JPF.Loopunreach550_EQ,
          // SymExParameter_JPF.Loopunreach300_EQ,
          
          
          // SymExParameter_JPF.Const_EQ,
          // SymExParameter_JPF.Pos2_EQ,
          
          
          // SymExParameter_JPF.Loopunreach40_EQ,
          // SymExParameter_JPF.Loopunreach415_EQ,
          // SymExParameter_JPF.Add_EQ,
          
          
          
          // SymExParameter_JPF.Loopunreach165_EQ,
          // SymExParameter_JPF.Loopunreach880_EQ,
          // SymExParameter_JPF.Is_prime3_EQ,
          
          // SymExParameter_JPF.Loopunreach705_EQ,
          
          // SymExParameter_JPF.Onen2_EQ,
          // SymExParameter_JPF.Getsign2_EQ,
          // SymExParameter_JPF.Loopunreach30_EQ,
          // SymExParameter_JPF.Odd_EQ,
          // SymExParameter_JPF.Pos3_EQ,
          // SymExParameter_JPF.Ltfivebound_EQ,
          // SymExParameter_JPF.Factorial_EQ,
          // SymExParameter_JPF.Loopunreach100_EQ,
          
          // SymExParameter_JPF.Fib_EQ,
          // SymExParameter_JPF.Loopunreach625_EQ,
          
          
          // SymExParameter_JPF.Loopunreach55_EQ,
          
          // SymExParameter_JPF.Loopunreach790_EQ,
          
          
          // SymExParameter_JPF.Loopunreach480_EQ,

          // SymExParameter_JPF.Is_prime1_EQ,
          // SymExParameter_JPF.Loopunreach205_EQ,
          // SymExParameter_JPF.Loopunreach130_EQ,
          // SymExParameter_JPF.Ltfive_EQ,
          // SymExParameter_JPF.Multiple_EQ,
          
          

          // SymExParameter_JPF.Loopmult2_NEQ,
          // SymExParameter_JPF.Loopmult5_NEQ,
          // SymExParameter_JPF.Loopmult10_NEQ,
          // SymExParameter_JPF.Loopmult15_NEQ,
          // SymExParameter_JPF.Loopmult20_NEQ,
          // SymExParameter_JPF.Loopmult25_NEQ,
          // SymExParameter_JPF.Loopunreach355_NEQ,
          // SymExParameter_JPF.Loopmult25_NEQ,
          // SymExParameter_JPF.Loopmult10_NEQ,
          // SymExParameter_JPF.Loopunreach75_NEQ,
          // SymExParameter_JPF.Loopmult880_NEQ,
          // SymExParameter_JPF.Loopmult130_NEQ,
          // SymExParameter_JPF.Loopmult355_NEQ,
          // SymExParameter_JPF.Loopmult550_NEQ,
          // SymExParameter_JPF.Loopmult250_NEQ,
          
          // SymExParameter_JPF.Loopmult705_NEQ,
          // SymExParameter_JPF.Loopmult205_NEQ,
          // SymExParameter_JPF.Loopunreach250_NEQ,
          
          // SymExParameter_JPF.Loopmult20_NEQ,
          // SymExParameter_JPF.Loopunreach550_NEQ,
          // SymExParameter_JPF.Loopunreach300_NEQ,
          // SymExParameter_JPF.Loopmult790_NEQ,
          // SymExParameter_JPF.Loopmult300_NEQ,
          // SymExParameter_JPF.Getsign_NEQ,
          // SymExParameter_JPF.Loopmult55_NEQ,
          // SymExParameter_JPF.Loopmult5_NEQ,
          // SymExParameter_JPF.Loopunreach40_NEQ,
          // SymExParameter_JPF.Loopunreach415_NEQ,
          // SymExParameter_JPF.Loopmult30_NEQ,
          
          // SymExParameter_JPF.Loopmult100_NEQ,
          // SymExParameter_JPF.Loopunreach165_NEQ,
          // SymExParameter_JPF.Loopunreach880_NEQ,
          // SymExParameter_JPF.Loopunreach2_NEQ,
          // SymExParameter_JPF.Loopunreach5_NEQ,
          // SymExParameter_JPF.Loopunreach10_NEQ,
          // SymExParameter_JPF.Loopunreach20_NEQ,
          // SymExParameter_JPF.Loopunreach25_NEQ,
          // SymExParameter_JPF.Loopunreach15_NEQ,
          // SymExParameter_JPF.Loopunreach705_NEQ,
          
          // SymExParameter_JPF.Loopunreach30_NEQ,
          // SymExParameter_JPF.Factorial_NEQ,
          // SymExParameter_JPF.Loopunreach100_NEQ,
          // SymExParameter_JPF.Loopmult625_NEQ,
          // SymExParameter_JPF.Fib_NEQ,
          // SymExParameter_JPF.Loopunreach625_NEQ,
          // SymExParameter_JPF.Fib2_NEQ,
          // SymExParameter_JPF.Loopmult165_NEQ,
          // SymExParameter_JPF.Loopunreach55_NEQ,
          // SymExParameter_JPF.Loopmult415_NEQ,
          // SymExParameter_JPF.Loopunreach790_NEQ,
          // SymExParameter_JPF.Loopmult480_NEQ,
          // SymExParameter_JPF.Loopmult15_NEQ,
          // SymExParameter_JPF.Loopunreach480_NEQ,
          // SymExParameter_JPF.Loopmult40_NEQ,
          // SymExParameter_JPF.Loopunreach205_NEQ,
          // SymExParameter_JPF.Loopunreach130_NEQ,
          
          // SymExParameter_JPF.Loopmult75_NEQ

          //below are old ones
          //neq

          // SymExParameter_JPF.LoopUnreach2,
          // SymExParameter_JPF.GetSign,
          // SymExParameter_JPF.LoopMult2,

          //eq
          // SymExParameter_JPF.Add,
          // SymExParameter_JPF.Const,
          // SymExParameter_JPF.Divide,
          //  SymExParameter_JPF.Factorial_eq,

        };

        // SymExParameter[] subjects = new SymExParameter[args.length];
        // for (int i = 0;i < args.length;i++) {
        //   subjects[i] = (SymExParameter) deserialize(args[i]);
        // }

        try {
            runExperiments(subjects);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Object deserialize( String s ) throws IOException ,
                                                       ClassNotFoundException {
        byte [] data = Base64.getDecoder().decode( s );
        ObjectInputStream ois = new ObjectInputStream( 
                                        new ByteArrayInputStream(  data ) );
        Object o  = ois.readObject();
        ois.close();
        return o;
   }

    private static Set<MyPathCondition> executeShadowSymbolicExecutionForMethod(SymExParameter param) {
        ShadowListener shadowListener = null;
        try {
            Config conf = initConfig();
            conf.setProperty("classpath", param.classpath);
            conf.setProperty("sourcepath", param.sourcepath);
            conf.setProperty("target", param.packageName + "." + param.className);

            StringBuilder sb = new StringBuilder();
            for (String method : param.methodNameWithSymbolicParameter.split(",")) {
                sb.append(param.packageName);
                sb.append(".");
                sb.append(param.className);
                sb.append(".");
                sb.append(method);
                sb.append(",");
            }
            conf.setProperty("symbolic.method", sb.toString());

            if (param.constraintSolver == null) {
                conf.setProperty("symbolic.dp", "choco");
            } else {
                String currentSubject = param.className.substring(param.className.indexOf("_") + 1,
                        param.className.length() - 1);
                String solver = param.constraintSolver.get(currentSubject);
                if (solver == null) {
                    conf.setProperty("symbolic.dp", "choco");
                } else {
                    conf.setProperty("symbolic.dp", solver);
                }
            }
            conf.setProperty("symbolic.dp", "z3"); // TODO remove later

            JPF jpf = new JPF(conf);
            shadowListener = new ShadowListener(conf, jpf);
            jpf.addListener(shadowListener);
            jpf.run();
            if (jpf.foundErrors()) {
                System.out.println("#FOUND ERRORS = " + jpf.getSearchErrors().size());
            }
            return shadowListener.collectedPCs;
        } catch (JPFConfigException cx) {
            cx.printStackTrace();
            if (shadowListener != null) {
                return shadowListener.collectedPCs;
            }
        } catch (JPFException jx) {
            jx.printStackTrace();
            if (shadowListener != null) {
                return shadowListener.collectedPCs;
            }
        }
        return null;
    }

    private static Config initConfig() {
        Config conf = JPF.createConfig(new String[0]);
        conf.setProperty("symbolic.min_int", "-100");
        conf.setProperty("symbolic.max_int", "927");
        conf.setProperty("symbolic.min_double", "-100.0");
        conf.setProperty("symbolic.max_double", "100.0");
        conf.setProperty("symbolic.undefined", "-1000");
        conf.setProperty("search.multiple_errors", "true");
        conf.setProperty("jvm.insn_factory.class", "gov.nasa.jpf.symbc.SymbolicInstructionFactory");
        conf.setProperty("vm.storage.class", "nil");
        // conf.setProperty("search.depth_limit", "30"); // default = null, i.e.
        conf.setProperty("symbolic.optimizechoices", "false");
        return conf;
    }

    private static void printPathConditions(Set<MyPathCondition> pathConditions, SymExParameter param) {
        System.out.println(param);
        System.out.println();
        if (pathConditions == null) {
            System.out.println("Terminated unexpectedly with <null>.");
        } else if (pathConditions.isEmpty()) {
            System.out.println("PathCondition: FALSE");
        } else if (pathConditions.size() == 1 && pathConditions.contains(SymbolicListener.TRUE)) {
            System.out.println("PathCondition: TRUE");
        } else {
            int counterViolations = 0;
            for (MyPathCondition myPC : pathConditions) {
                if (myPC.equals(SymbolicListener.TRUE)) {
                    System.out.println("PathCondition: TRUE \n");
                } else if (myPC.pc != null) {
                    try {
                        boolean isSat = myPC.pc.solve();
                        System.out.println(myPC.pathResultType + "; " + "SAT = " + isSat);
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                        System.out.println(myPC.pathResultType + "; " + "SAT = UNKNOWN NPE");
                    }
                    Map<String, Object> solution = myPC.pc.solveWithValuation();
                    for (String var : solution.keySet()) {
                        System.out.println(var + "=" + solution.get(var));
                    }

                    System.out.println(myPC.pc + "\n");

                    if (myPC.pathResultType == PathResultType.PROPERTY_VIOLATED) {
                        counterViolations++;
                    }
                } else {
                    throw new RuntimeException("PC is null..");
                }
            }
            System.out.println();
            System.out.println("#PROPERTY_VIOLATED = " + counterViolations);
            System.out.println("#Total = " + pathConditions.size());
        }
    }

    public static void runExperiments(SymExParameter[] subjects) {

        Set<MyPathCondition> resultingPCs = null;
        for (SymExParameter subject : subjects) {

            // Run shadow symbolic execution for change-annotated files.
            for (int i = 1; i <= subject.numberOfClassesInBenchmark; i++) {

                if (subject.equals(SymExParameter_JPF.Rational_gcd) && i==8) {
                    continue;
                }
                if (subject.equals(SymExParameter_JPF.Rational_simplify) && i==12) {
                    continue;
                }

                SymExParameter symExParameter = new SymExParameter(subject.classpath, subject.sourcepath,
                        subject.packageName, subject.className + "_" + i + "c", subject.methodName,
                        subject.methodNameWithSymbolicParameter, 1, "", subject.resultsDirectory,
                        subject.constraintSolver);
                String logPath = symExParameter.resultsDirectory + "log-" + symExParameter.packageName + "."
                        + symExParameter.className + ".txt";
                try {
                    ensureFileAndDirectoryExists(logPath);
                    System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(logPath)), true));
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                resultingPCs = executeShadowSymbolicExecutionForMethod(symExParameter);
                printPathConditions(resultingPCs, symExParameter);
            }

            if (!subject.specialBenchmarks.equals("")) {
                for (String specialBenchmark : subject.specialBenchmarks.split(",")) {
                    SymExParameter symExParameter = new SymExParameter(subject.classpath, subject.sourcepath,
                            subject.packageName, subject.className + "_" + specialBenchmark + "c", subject.methodName,
                            subject.methodNameWithSymbolicParameter, 1, "", subject.resultsDirectory,
                            subject.constraintSolver);
                    String logPath = symExParameter.resultsDirectory + "log-" + symExParameter.packageName + "."
                            + symExParameter.className + ".txt";
                    try {
                        ensureFileAndDirectoryExists(logPath);
                        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(logPath)), true));
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    resultingPCs = executeShadowSymbolicExecutionForMethod(symExParameter);
                    printPathConditions(resultingPCs, symExParameter);
                }
            }

        }
    }

    private static void ensureFileAndDirectoryExists(String path) throws IOException {
        File file = new File(path);
        if (!file.isFile()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
    }

}
