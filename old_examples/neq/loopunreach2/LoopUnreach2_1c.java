package neq.loopunreach2;

class LoopUnreach2_1c {

  int change(int oldVal, int newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}

  int lib(Integer a, Integer b) {
    Integer c = change(new Integer(0), new Integer(1));
    if (change(a.compareTo(0) < 0, b.compareTo(0) < 0)) {
        Integer i = 1;
        while (change(i.compareTo(a) <= 0, i.compareTo(b) <= 0)) {
            c += change(a, b);
            i += 1;
        }
    }
    if (change(c.compareTo(1) == 0, c.compareTo(0) == 0)) {
      return c;
    } else {
      return c;
    }
  }

  public static void main(String[] args) {
    (new LoopUnreach2_1c()).lib(2, 2);
  }
}