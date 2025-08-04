package Collections;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args)
    {
        int a;
        ArrayList<Integer> val = new ArrayList<Integer>();
        for(int x = 11; x<=19; x++)
        {
            val.add(x);
        }
        System.out.println(val);
         a = val.remove(0);
        System.out.println(val);
        System.out.println(a);
        System.out.println(val.size());
        for(int x = 0; x<= val.size() - 1; x++)
            System.out.printf("%9d", val.get(x));



    }

}
