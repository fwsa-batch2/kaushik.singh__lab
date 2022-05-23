import java.io.*;


public class crioex {
    public static void main(String[] args) throws IOException {
        File crio = new File("C:\\Users\\kaushik\\Documents\\java\\crioex.java");
        if(crio.createNewFile()) {
           System.out.println("File created is done on given path ");
        }
        else {
            System.out.println("File already created");
        }
    }
}

