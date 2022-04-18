public class reverse {
 public static void main(String[] args) {
        int students = 31 , reverse = 0;
        while (students != 0){
            int ans = students % 10;
            reverse = reverse*10 + ans;
            students = students/10;
        }
        System.out.println("reverse number is " + reverse);
    }
}
