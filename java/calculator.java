public class calculator {
     public static void main(String[] args) {
        float num1 = add(15.5f,7.0f);
        // int ka = add(13,2);
        int num2 = sub(30,8);
        int num3 = mul(2,2);
        int num4 = div(20,2);
        System.out.println(" your number for addition is   " + num1);
        System.out.println(" your number for subcraction is   " + num2);
        System.out.println(" your number for multiplaction is   " + num3);
        System.out.println(" your number for division is   " + num4);
        // System.out.println(" your number for division is   " + ka);



    }
    public static float add (float a, float b){
        float add1 = a + b;
        return add1;
    }
    public static int sub (int a, int b){
        int sub1 = a - b;
        return sub1;
    }
    public static int mul (int a, int b){
        int mul1 = a * b;
        return mul1;
    }
    public static int div (int a, int b){
        int div1 = a / b;
        return div1;
    }

    
    // int num4 = 2;
    // int num3 = 6;
    // int add = num4+num3;

    // System.out.println(" your number for addition is   " + add);

    // switch(add){
        
    //     case '+':
    //      add = num4 + num3;
    //     //  System.out.println(" your number for addition is   " + add);
    //      break;
    //     }
          
        // }
}
