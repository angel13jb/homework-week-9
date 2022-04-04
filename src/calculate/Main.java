package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //import scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();//4
        System.out.println("Enter second number:");
        int b=sc.nextInt();//5
        System.out.println("Please enter one symbol +,-,/,* :");
       char symbol= sc.next().charAt(0);//+
       //calling method via object
      Calculator cal=new Calculator();
        cal.calculateResult(a,b,symbol);//result will be addition of 4and5 is 9











    }
}
