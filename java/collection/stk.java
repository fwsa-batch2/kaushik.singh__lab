package collection;
import java.util.*;

public class stk {
    public static void main(String[] args) {
        Stack<String> obj = new Stack<String>();
            obj.add("kaushik");
            obj.add("fwsa");
            obj.add("devp");

            System.out.println(obj);

            obj.pop();
            System.out.println(obj);
    }
}
