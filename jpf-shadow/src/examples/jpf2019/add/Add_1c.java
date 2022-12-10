package jpf2019.add;

class Add_1c {
    int change(Integer oldVal,Integer newVal) {return oldVal;}
    boolean change(boolean oldVal, boolean newVal) {return oldVal;}

    // int libOld(int a, int b) {
    //   int c = a + b;
    //   return c;
    // }

    // int libNew(int a, int b) {
    //   int c = b + a;
    //   return c;
    // }

    int add(int a, int b) {
      int z = change(a + b, b + a); 
      return z;
    }

    public static void main(String[] args) {
        (new Add_1c()).add(500, 9);
    }
}