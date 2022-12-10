package eq.LoopMult10;
class Loopmult10_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, b);

        return c;
    }

  int foo(int x) {
    if (x >= 9 && x < 12) {
      return lib(x, 10);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult10_1c()).foo(9);
  }

}