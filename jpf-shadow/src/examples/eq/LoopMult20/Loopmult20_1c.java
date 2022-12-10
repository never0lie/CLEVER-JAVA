package eq.LoopMult20;
class Loopmult20_1c {
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
    if (x >= 18 && x < 20) {
      return lib(x, 20);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult20_1c()).foo(14);
  }
}