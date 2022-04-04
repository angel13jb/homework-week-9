package week9;

import java.util.ArrayList;

public class Program07 {
    public static void test(){
    //program to test an array list is empty or not
    //array list with underground tube name
    ArrayList<String>list=new ArrayList<>();
    list.add("Bakerloo");
    list.add("Central");
    list.add("District");
    list.add("Jubilee");
    list.add("Piccadilly");

    //test to check array list empty or not
    System.out.println(list.isEmpty());

        }
    //calling in main method
    public static void main(String[] args) {
        test();
    }}