public class Calculator {
// Calculator Using Switch Case
//Problem Statement: Write a Java program that accepts two numbers and an operator (+, -, *, /, %), then performs the selected operation using the switch statement.

    public float calCu(int a , int b ,String op){
        switch(op){
            case "+" -> System.out.println(a+b);
            case "-" -> System.out.println(a-b);
            case "*" -> System.out.println(a*b);
            case "%" -> System.out.println(a%b);
            case "/" -> {
                if(b!=0){
                    System.out.println(a/b);
                }else{
                    System.out.println("cannot divide by 0");
                }
            }
            default -> System.out.println("Something Went Wrong");
        }
        return 0;
    }
}
