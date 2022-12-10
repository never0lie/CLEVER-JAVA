package eq.Add;


class Add_1c {
    int change(int oldVal,int newVal) {return oldVal;}

    int add(int a, int b) {
        int c = change(a + b, b + a);
        return c;
    }

    public static void main(String[] args) {
        (new Add_1c()).add(5, 900);
    }
}