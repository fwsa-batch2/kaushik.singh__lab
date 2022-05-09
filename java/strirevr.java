public class strirevr {
    public static void main(String[] args) {    
        String name = "kaushik";    
        String pinadi = "";    
                for(int i = name.length()-1; i >= 0; i--){    
             pinadi = pinadi + name.charAt(i);    
        }    
            System.out.println("Reverse : " + pinadi);  
    }   
}   

