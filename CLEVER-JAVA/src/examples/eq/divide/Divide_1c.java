package examples.eq.divide;

class Divide_1c {
    int change(int oldVal,int newVal) {return oldVal;}
    int change(boolean oldVal,boolean newVal) {return oldVal;}

    int lib(int x, int y) {
        if (change(false, y == 0)) {
            return 0;
        }
        return change(x / y, x / y);
    }

    public int divide(int c, int d) {
        if (d == 0) {
            return 0;
        }
        return lib(c, d);
    }

    public static void main(String[] args) {
        int c;
        int d;

        (new Divide_1c()).divide(c, d);
    }

}