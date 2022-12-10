package eq.loopmult205;
class Loopmult205_1c {
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, b);

        return c;
    }

  int foo(int x) {
    if (x >= 183 && x < 227) {
      return lib(x, 205);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult205_1c()).foo(184);
  }
}