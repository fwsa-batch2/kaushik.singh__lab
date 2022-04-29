public class methods {
    // parameters and arugents  
    // static void varymeth(String frist) {
    //     System.out.println(frist + " Hello method");
    // }
    // public static void main(String[] args) {
    //     varymeth("kaushik");  
    //     varymeth("aswath");
    //     varymeth("vimal");
    // }

    
    // create method
    // static void varymeth() {
    //     System.out.println( " Hello method");
    // }
    // public static void main(String[] args) {
    //     varymeth();  
    //     varymeth();
    //     varymeth();
    // }

    
    
     // multiple parameters
    static void varymeth(String name, int age) {
        System.out.println(name + " Hello method " + age);
    }
    public static void main(String[] args) {
        varymeth("kaushik" ,19);  
        varymeth("aswath" ,17);
        varymeth("vimal" ,19);
    }
}
