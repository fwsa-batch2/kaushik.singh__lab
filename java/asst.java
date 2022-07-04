public class asst{
        public static void main(String[] args) {   
            revs(); 
        }   
        public static void revs(){
            String name = "prasanna";    
            String back = "";    
                    for(int a = name.length()-1; a >= 0; a--){    
                 back = back + name.charAt(a);    
            }    
                System.out.println("Reverse : " + back);
        }

    }  
    
    