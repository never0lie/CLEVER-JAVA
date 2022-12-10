package neq.LoopMult2;

class Loopmult2_1c {
    int change(int oldVal, int newVal) {
        return oldVal;
    }

    boolean change(boolean oldVal, boolean newVal) {
        return oldVal;
    }

    int foo(int a, int b) {
        int c = 0;
        for (int i = 1; i <= change(b, a); ++i)
            c -= change(a, b);

        return c;
    }

    public static void main(String[] args) {
        (new Loopmult2_1c()).foo(2, 2);
    }

}