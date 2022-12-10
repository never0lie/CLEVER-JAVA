package jpf2019.isbigger;

class IsBigger_1c {
    int change(int oldVal,int newVal) {return oldVal;}
    boolean change(boolean oldVal, boolean newVal) {return oldVal;}

    boolean libOld(int a, int b) {
      //return b.compareTo(a) > 0;
      return b < a;
    }

    boolean libNew(int a, int b) {
      //return b.compareTo(a) > 0;
      return a <= b;
    }

    int isBigger(int a, int b) throws Exception {
        boolean c = true;;
        if (c) {
          if (change(libOld(a, b), libNew(a, b))) {
              c = true;
          } else {
              c = false;
          }
        }
        return 0;
        //assert(change(libOld(a, b), libNew(a, b)));
        /*try {
           assert(change(libOld(a, b), libNew(a, b)));
        } catch (Error ex) {

        }

        return 0;*/
    }

    public static void main(String[] args)  throws Exception {
      // change(isBigger_new, isBigger_old);
        (new IsBigger_1c()).isBigger(0, 0);
        //int a = 5;
        //int b = 900;
        //(new IsBigger_1c()).isBigger(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}