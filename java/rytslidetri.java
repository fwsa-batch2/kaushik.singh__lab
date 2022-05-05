public class rytslidetri {
    static int num = 5;
    public static void main(String[] args) {
        for (int i=1;i<=num;i++){
            for(int j =1;j<=i;j++){
                System.out.print("  ");
            }for(int j =i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
