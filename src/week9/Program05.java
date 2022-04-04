package week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Program05 {
    public void iterate() {
        //program to iterate through all elements in array list using iterator
        //crrate array list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //using iterator
        Iterator itr=list.iterator();
        //using in while loop
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    //calling method in main method
    public static void main(String[] args) {
        Program05 obj=new Program05();
        obj.iterate();
    }

}
