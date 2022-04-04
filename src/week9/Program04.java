package week9;

import java.util.ArrayList;

public class Program04 {
    //program to create arraylist print out colour collection using for each loop
    public static void  test() {
        //create array list
        ArrayList<String>list=new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("White");
        list.add("Yellow");
        //using for each loop
        for (String colourname:list) {
            System.out.println(colourname);

        }
    }
    //calling in main method
    public static void main(String[] args) {
        test();
    }

}
