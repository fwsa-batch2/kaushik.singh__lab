public class strng {
    public static void main(String[] args) {

        int number,num,remd,fact,ans=0;
        number = 145;
        num = number;
        while(number>0){
            remd=number%10;
            fact = 1;
            for(int i = 1; i<=remd; i++){
                fact*=i;
            }ans+=fact;
            number=number/10;}
        if(ans==num){
            System.out.println(num + " is a strong number");
        }else{
            System.out.println(num + " is not a strong number");
        }    }
}
