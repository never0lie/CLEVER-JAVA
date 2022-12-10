package eq.Const;

class Const_1c {
    int change(int oldVal,int newVal) {return oldVal;}
    Integer change(Integer oldVal,Integer newVal) {return oldVal;}

    int lib(Integer a, Integer b) {
        Integer d = 3;
        Integer c = change(b + a, a + b);
        return change(c + d, c + 3);
    }

    public static void main(String[] args) {
        (new Const_1c()).lib(5, 900);
    }
}