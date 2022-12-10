package neq.LoopUnreach10;
class Loopunreach10_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}

  int lib(int a, int b) {
    int c = change(0, 1);
    if (change(a <= 0, b <= 0)) {
      int i = 1;
      while (change( i<=a, i <= b)) {
        c += change(b, a);
        i += 1;
      }
    }
    if (change(c == 0, c == 1)) {
      return c;
    } else {
      return c;
    }
  }

  int foo(int x) {
    if (x >= 9 && x < 12) {
      return lib(x, 10);
    }
    return 0;
  }

  public static void main(String[] args) {
    (new Loopunreach10_1c()).foo(10);
  }
}