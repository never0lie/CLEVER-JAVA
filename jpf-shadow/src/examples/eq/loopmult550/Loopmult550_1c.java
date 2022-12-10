package eq.loopmult550;
class Loopmult550_1c {
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}


  int lib(int a, int b) {
        int c = 0;
        for (int i = 1; change(i <= b,i <= a); ++i)
            c += change(a, b);

        return c;
    }

  int foo(int x) {
    if (x >= 513 && x < 587) {
      return lib(x, 550);
    }
    return 0;
  }

  public static void main(String[] args) {
      (new Loopmult550_1c()).foo(513);
  }
}