package eq.loopmult625;
class Loopmult625_1c {
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, b);

        return c;
    }

  int foo(int x) {
    if (x >= 585 && x < 665) {
      return lib(x, 625);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult625_1c()).foo(585);
  }
}