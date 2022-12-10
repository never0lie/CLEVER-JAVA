package eq.LoopUnreach2;
class Loopunreach2_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}

  int lib(Integer a, Integer b) {
    Integer c = change(new Integer(0), new Integer(0));
    if (change(a.compareTo(0) <= 0, b.compareTo(0) <= 0)) {
      Integer i = 1;
      while (change(i.compareTo(a) <= 0, i.compareTo(b) <= 0)) {
        c += change(b, a);
        i += 1;
      }
    }
    if (change(c.compareTo(1) == 0, c.compareTo(0) == 1)) {
      return c;
    } else {
      return c;
    }
  }

  public static void main(String[] args) {
    (new Loopunreach2_1c()).lib(2,2);
  }
}