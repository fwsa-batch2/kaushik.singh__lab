class thread{
        void elsbatch2(){
            System.out.println("Good moring fearless coders");
        }
    }

    class kaushik extends thread{
        void student(){
            System.out.println("Happy mornig everyone!!");
        }
    }
    
    class haiden extends thread{
        void fwsa(){
            System.out.println("Good moring everyone");
        }
    }    

    class sugu extends thread{
        void devp(){
            System.out.println("Happy moring everyone");
        }
    }   
    
class freshbuzz{
    public static void main(String[] args) {
        kaushik obj = new kaushik();
        haiden obj2 = new haiden();
        sugu obj3 = new sugu();

        obj.elsbatch2();
        obj.student();
        obj2.elsbatch2();
        obj2.fwsa();
        obj3.elsbatch2();
        obj3.devp();
    }
}  

