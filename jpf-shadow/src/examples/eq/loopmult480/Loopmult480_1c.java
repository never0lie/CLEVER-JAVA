package eq.loopmult480;
class Loopmult480_1c {
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, b);

        return c;
    }

  int foo(int x) {
    if (x >= 445 && x < 515) {
      return lib(x, 480);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult480_1c()).foo(445);
  }
}