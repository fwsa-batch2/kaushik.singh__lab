interface add{
    public void num1();
 }
 interface mul{
    public void num2();
 }
 interface multiinheri extends add , mul {
    public void num1();
    public void num2();
 }
 class heri implements multiinheri{
    public void num1(){
        System.out.println("Iam kaushik");
    }
    public void num2(){
        System.out.println("FWSA student");
    }
 }
 class MultipleInheritance {
    public static void main(String[] args) {
        heri obj = new heri();
        obj.num1();
        obj.num2();
    }
 }
