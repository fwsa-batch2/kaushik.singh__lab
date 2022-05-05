public class overridingg {
    public static void main(String[] args) {
        corrected obj = new corrected();
        obj.fun();
    }
}

    class autocorrection{
        void fun(){
            System.out.println("ena panra");
        }

    }

    class corrected extends autocorrection{
        @Override
        void fun(){
            System.out.println("what are you doing");
        }
    }
