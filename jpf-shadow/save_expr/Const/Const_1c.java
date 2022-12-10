package eq.Const;

class Const_1c {
    int change(int oldVal,int newVal) {return oldVal;}

    int lib(int a, int b) {
        int d = 3;
        int c = change(b + a, a + b);
        return change(c + d, c + 3);
    }

    public static void main(String[] args) {
        (new Const_1c()).lib(5, 900);
    }
}