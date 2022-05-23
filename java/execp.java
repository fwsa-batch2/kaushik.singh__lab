public class execp {
    public static void main(String[] args) {
        // try{
        //     int[] num ={1,2,3,4};
        //     System.out.println(num[5]);
        // }catch (Exception e){
        //     System.out.println("the code was not good");

        // }

        try{
            int[] num ={1,2,3,4};
            System.out.println(num[2]);
        }catch (Exception e){
            System.out.println("the code was not good");

        }finally{
            System.out.println("Hello every one");
        }
    }
}
