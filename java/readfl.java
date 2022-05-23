import java.io.*;
import java.util.Scanner;


public class readfl {
    public static void main(String[] args) throws IOException {
        File rea = new File("C:\\Users\\kaushik\\Documents\\java\\readfl.java");
        try (Scanner scan = new Scanner(rea)) {
            while(scan.hasNextLine()) {
                System.out.println(scan.hasNextLine());
            }
        }
    }
}

