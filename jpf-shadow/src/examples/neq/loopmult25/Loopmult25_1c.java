package neq.loopmult25;
class Loopmult25_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        int d = -b;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, d);

        return c;
    }

  int foo(int x) {
    if (x >= 23 && x < 27) {
      return lib(x, 25);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult25_1c()).foo(23);
  }
}