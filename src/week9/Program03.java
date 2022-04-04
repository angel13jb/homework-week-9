package week9;

import java.util.Arrays;
import java.util.Collections;

public class Program03 {
    //program to reverse integer value in array
   //using java ccollection reverse to reverse integer
    public static void reverse(Integer a[]) {
        //first convert array to array list
        System.out.println("Number before reverse");
        System.out.println(Arrays.asList(a));
        //then use java collection reverse to reverse array list
        System.out.println("Number after reverse:");
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args) {
        //initialising array value
        Integer a[] = {10, 20, 30, 40, 50};
        reverse(a);
    }


}
