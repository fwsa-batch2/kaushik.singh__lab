public class armstrong {
    public static void main(String[] args) {
        int number = 8313, armstrg, valu, answer = 0;

        armstrg = number;

        while (armstrg != 0)
        {
            valu = armstrg % 10;
            answer += Math.pow(valu, 4);
            armstrg /= 10;
        }

        if(answer == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
