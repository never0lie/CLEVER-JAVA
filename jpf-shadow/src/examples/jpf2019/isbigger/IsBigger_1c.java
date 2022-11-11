package jpf2019.isbigger;

class IsBigger_1c {
    int change(int oldVal,int newVal) {return oldVal;}
    boolean change(boolean oldVal, boolean newVal) {return oldVal;}

    int isBigger(Integer a, Integer b) {

        if (change(a.compareTo(b) > 0, b.compareTo(a) > 0)) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void main(String[] args) {
        (new IsBigger_1c()).isBigger(5, 900);
    }
}