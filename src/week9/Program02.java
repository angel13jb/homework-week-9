package week9;

import java.util.Scanner;

public class Program02 {
//program to print marksheet
    public static void main(String []args) {
        //input student name,roll no,marks
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Name\t\t\t:\t");
        String name = sc.next();

        System.out.print("Enter the Roll No \t\t\t:\t");
        int roll = sc.nextInt();

        System.out.print("Math:\t");
        int math = sc.nextInt();

        while (math < 0 || math > 100) {
            System.out.println("Invalid Marks. Please Enter mark between 0 and 100.");//marks between 0to 100 else its invalid
            System.out.print("\n Math \t\t\t:\t ");
            math = sc.nextInt();
            break;
        }

        System.out.print("Science : ");
        int science = sc.nextInt();
        while (science < 0 || science > 100) {
            System.out.println("Invalid Marks. Please Enter mark between 0 and 100.");//mark should be between 0 to 100 or its invalid
            System.out.print("Science : ");
            science = sc.nextInt();
            break;
        }

        System.out.print("English  : ");
        int english = sc.nextInt();
        while (english < 0 || english > 100) {
            System.out.println("Invalid Marks. Please Enter mark between 0 and 100.");//marks should be betwwen 0 to 100
            System.out.print("English  : ");
            english = sc.nextInt();
            break;
        }
            sc.close();
        int total = math + science + english;//get total of marks
        double percentage = total * 100 / 300;//get percentage

        String result = "";
        String grade = "";

        if (percentage >= 35) {
            result = result + "pass";//percentage must be above 35 for pass
        } else {
            result = result + "fail";//if percentage below 35 than fail
        }

        if (percentage >= 80) {

            grade = grade + "Grade A+";
        } else if (percentage >= 60) {
            grade = grade + "Grade A";
        } else if (percentage >= 50) {
            grade = grade + "Grade B";
        } else if (percentage >= 35) {
            grade = grade + "Grade C";
        }


        //whole mark sheet display as below
        System.out.println("|------------------------------------------|");
        System.out.println("|              Mark Sheet                  |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Name   : " + name +"\t\t\t\t\t\t\t\t\t|");
        System.out.println("|    Roll No: " + roll +"\t\t\t\t\t\t\t\t\t|");
        System.out.println("|__________________________________________|");
        System.out.println("|    Subject    : Marks                    |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Math       :" + math +" \t\t\t\t\t\t\t|");
        System.out.println("|    Science    :" + science +"\t\t\t\t\t\t|");
        System.out.println("|    English    :" + english +"\t\t\t\t\t\t|");
        System.out.println("|__________________________________________|");
        System.out.println("|    Total      : " + total + "            |");
        System.out.println("|__________________________________________|");
        System.out.println("|    Percentage : " + percentage + "%      |");
        System.out.println("|    Result      : " + result + "          |");
        System.out.println("|    Grade      : " + grade + "            |");
        System.out.println("|__________________________________________|");


    }}















