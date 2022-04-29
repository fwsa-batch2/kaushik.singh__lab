public class switchcase {
    public static void main(String[] args) {
        String student;
        int mark = 90;

        switch(mark){
            
            case 50:
             student = "gaja";
             break; 

            case 60:
             student = "aswin";
             break;

            case 65:
             student = "rahamath";
             break;

            case 70:
             student = "kaushik";
             break;
            
            case 90:
             student = "john";
             break;
             
            default:
             student = "Unknown";
             break;

        }

        System.out.println("Topper name: "+ student);
    }
}
