package eq.is_prime1;

class Is_prime1 {
    int change(int oldVal,int newVal) {return oldVal;}
    boolean change(boolean oldVal,boolean newVal) {return oldVal;}

    static int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19 };

    int lib(int x, int b) {
        if (b == 0) {
            return 0;
        } else {
            for (int i = 0; i < primes.length; i++) {
                int mod = x % primes[i];
                if (mod == 0)
                    if (change(false, x == b)) {
                        return 1;
                    }
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int x = 5;
        (new Is_prime1()).lib(x, 0);
    }

}