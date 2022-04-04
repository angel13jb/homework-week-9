package week9;

import java.util.HashSet;
import java.util.Set;

public class Program08 {
    //use a hashset that stores integer objects.store number 4,7,8 to sets
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //define value
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <=10; i++) {
            //if i= 4,7,8 than print number is between 1 to 10 or invalid for other number
            if (set.contains(i))
                System.out.println(i+"number is between 1 and 10");
             else
                System.out.println(i+"invalid number");


        }
    }

}











