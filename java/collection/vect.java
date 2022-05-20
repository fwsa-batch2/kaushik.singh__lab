package collection;
import java.util.*;

public class vect {
    private static final int i = 1;

    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<Integer>();
        for(int i=1; i<=5; i++)

            obj.add(i);
            System.out.println(obj);

            obj.remove(3);
            System.out.println(obj);
    
            for(int i=0; i<obj.size(); i++);
            System.out.println(obj.get(i) + "");
        
    }
}
