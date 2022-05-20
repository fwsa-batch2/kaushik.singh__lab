package collection;

import java.util.*;

public class Arrlst {
    private static final int i = 0;

    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();

        for(int i=1; i<=5; i++)

        // add value..
        obj.add(i);
        System.out.println(obj);

        // remove value..
        obj.remove(3);
        System.out.println(obj);

        for(int i=0; i<obj.size(); i++);
        System.out.println(obj.get(i) + "");
        
    }


}


