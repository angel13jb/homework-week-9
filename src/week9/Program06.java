package week9;

import java.util.ArrayList;

public class Program06 {
    //program to retrieve an element at specific index from given array list
    public void display(){
        //create arraylist with days name
        ArrayList<String>data=new ArrayList<>();
        data.add("Monday");
        data.add("Tuesday");
        data.add("Wednesday");
        data.add("Thursday");
        data.add("Friday");
        data.add("Saturday");
        data.add("Sunday");
        //retrieve data at specific index
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
        System.out.println(data.get(5));
        System.out.println(data.get(6));

    }
    //calling method via object
    public static void main(String[] args) {
        Program06 obj=new Program06();
        obj.display();
    }
}
