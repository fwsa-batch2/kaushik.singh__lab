import java.io.IOException;

public class thrwex {
    public static void filefield() throws IOException {
        throw new IOException("File not found");

    }
    public static void main(String[] args) {
        try{
            filefield();
            System.out.println("throw block");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
