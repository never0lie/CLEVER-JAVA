package examples.eq.fib;

class Factorial_1c {
    int change(int oldVal, int newVal) {
        return oldVal;
    }

    int change(boolean oldVal, boolean newVal) {
        return oldVal;
    }


    int lib(int n) {
        if (n == 1) {
            return 1;
        } else if (n < 1) {
            return 0;
        } else {
            return lib(n - 1) + lib(n - 2);
        }
    }

    int fib(int x) {
        if (x < 5) {
            return lib(x);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x;
        (new Factorial_1c()).factorial(x);
    }
}