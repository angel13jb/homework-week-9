package calculate;
//create class with name calculator
public class Calculator {
    //instance method with parameters
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }
    public void division(int a,int b){
        System.out.println(a/b);
    }

    public void multiplication(int a,int b){
        System.out.println(a*b);
    }
//method with three parameters
    public void calculateResult(int a,int b,char symbol){
        //enter vaule and based on symbol it will print result
        if(symbol=='+'){
            System.out.println("Addition of"+a+"+"+b+"is:"+(a+b));
        }else if(symbol=='-'){
            System.out.println("Subtraction of"+a+"-"+b+"is:"+(a-b));
        }else if(symbol=='*'){
            System.out.println("Multiplication of"+a+"*"+b+"is:"+(a*b));
        }else if (symbol=='/'){
            System.out.println("Division of"+a+"/"+b+"is:"+(a/b));
        }else
            System.out.println("please enter correct symbol");

    }

}
