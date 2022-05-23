package collection;

import java.util.*;
public class prique {
    
    public static void main(String[] args) {
        
   
    PriorityQueue<Integer> priyo = new PriorityQueue<>();
        
        priyo.add(5);
        priyo.add(5);
        System.out.println("Hello " + priyo);

        priyo.offer(7);
        System.out.println("adding " + priyo);

        System.out.println("listing " + priyo.poll());
        System.out.println("listing " + priyo.poll());
        System.out.println("listing " + priyo.poll());
}
}
