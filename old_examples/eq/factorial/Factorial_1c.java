package eq.factorial;

class Factorial_1c {
    int change(int oldVal, int newVal) {
        return oldVal;
    }
    boolean change(boolean oldVal,boolean newVal) {return oldVal;}


    int lib(int n) {
        if (change(n > 0, false)) {
            int acc = 1;
            int x = 1;
            while (x < n + 1) {
                acc = acc * x;
                x = x + 1;
            }
            return acc;
        }
        if (change(false, n <= 0)) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return n * lib(n - 1);
            }
        }
        return 0;
    }

    int factorial(int x) {
        if (x < 5) {
            return lib(x);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        (new Factorial_1c()).factorial(x);
    }
}