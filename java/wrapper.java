public class wrapper {
    // public static void main(String[] args) {

    //     // autoboxing..

    //     int priven = 18;
    //     Integer wrap = Integer.valueOf(priven);

    //     System.out.println("Given privent value is " + priven);
    //     System.out.println("Given privent value changed into wrapper " + wrap);


    //     // unboxing..

    //     Integer unbox = 17;
    //     int pri = wrap.intValue();

    //     System.out.println("the unboxing method change wrap into priven " + unbox);
    //     System.out.println("call the wrap " + pri);
    // }
    // }    
    public static void main(String[] args) {
        
        Float priven = 18.9f;
        Float wrap = Float.valueOf(priven);
        Float auto = priven;

        System.out.println("Given privent value is " + wrap);
        System.out.println("Given privent value changed into wrapper " + auto);


        Float unbox = 17.8f;
        float pri = wrap.floatValue();
        float unb = unbox;

        System.out.println("the unboxing method change wrap into priven " + pri);
        System.out.println("call the wrap " + unb);

    }
    }

   // boolean as same as float and for auto boxing Boolen - Boolen.valueof(....)  // unboxing boolen xxxx.boolenValue() 

   // As same as given in boolean same gose for char 
    

