package neq.LoopMult2;

class Loopmult2_1c {
    int change(int oldVal, int newVal) {
        return oldVal;
    }
    
    Integer change(Integer oldVal, Integer newVal) {
        return oldVal;
    }

    boolean change(boolean oldVal, boolean newVal) {
        return oldVal;
    }

    int foo(Integer a, Integer b) {
        Integer c = 0;
        Integer d = -b;
        for (Integer i = 1; change(i.compareTo(b) <= 0, i.compareTo(a) <= 0); ++i)

            c -= change(a, d);

        if (change(c.compareTo(0) <= 0, c.compareTo(0) > 0)) {
          return c;
        } else {
          return c;
        }
        
    }

    public static void main(String[] args) {
        (new Loopmult2_1c()).foo(2, 2);
    }

}