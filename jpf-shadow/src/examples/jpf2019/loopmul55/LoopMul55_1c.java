package jpf2019.loopmul5;

class LoopMul55_1c {
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}
  int change(int oldVal, int newVal) {return oldVal;}

  public int lib(int a, int b) {
    int c = 0;
    int i = 0;
    while (change(i < b,i < a)) {
      c += change(-a, b);
      i += 1;
    }
    return c;
  }

  public int loopMul55(int x){
    if (x >= 45 and x < 65):
		  return lib(x, 55)
	  return 0
  }

  public static void main(String[] args) {

    (new LoopMul55_1c()).loopMul55(6);
  }
}