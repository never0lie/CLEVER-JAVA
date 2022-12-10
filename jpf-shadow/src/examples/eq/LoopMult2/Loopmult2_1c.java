package eq.LoopMult2;
class Loopmult2_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}

  int foo(Integer a, Integer b) {
        Integer c = 0;
        for (int i = 1; change(b.compareTo(i) >= 0,a.compareTo(i) >= 0); ++i)
            c += change(a, b);

        return c;
    }

  public static void main(String[] args) {
      (new Loopmult2_1c()).foo(2, 2);
  }

}