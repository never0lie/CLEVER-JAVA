package jpf2019.add;

class Add_1c {
    int change(Integer oldVal,Integer newVal) {return oldVal;}
    boolean change(boolean oldVal, boolean newVal) {return oldVal;}

    int add(Integer a, Integer b) {

       Integer c = change(a + b, b + a);
       return c;

    }

    public static void main(String[] args) {
        (new Add_1c()).add(5, 900);
    }
}