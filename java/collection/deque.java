package collection;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        
    Deque<Integer> num = new ArrayDeque<Integer>();
    num.offer(4);
    num.offerFirst(1);
    num.offerLast(2);
    System.out.println(num);


    System.out.println("first declared " + num.getFirst());
    System.out.println("first declared " + num.getLast());


    System.out.println(num);

}
}
