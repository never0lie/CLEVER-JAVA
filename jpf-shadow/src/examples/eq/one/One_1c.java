package eq.one;
class One_1c {
  int change(int oldVal, int newvVal) {return oldVal;}
  Integer change(Integer oldVal, Integer newVal) {return oldVal;}
  boolean change(boolean oldVal, boolean newVal) {return oldVal;}

  int lib(int x) {
    if (x > 10) {
        return change(11, 12);
    } else {
        return change(x, x + 1);
    }
  }

  int yi(int x) {
    if (x > lib(x)) {
      return x;
    } else {
      return lib(x);
    }   
  }

  public static void main(String[] args) {
    (new One_1c()).yi(1);
  }
}