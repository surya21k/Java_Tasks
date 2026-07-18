import java.util.*;
public class ProgramsOnLoops {
    static Scanner scanner = new Scanner(System.in);
    public static void armstrongNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int count = 0,sum =0;
        int temp = num;
        while(num > 0){
            int h = num % 10;
            count++;
            num /= 10;
        }
        num = temp;
        while(num > 0 ){
            int digit = num % 10;
            sum += (int) Math.pow(digit,count);
            num /= 10;
        }
        if(sum == temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
    public void neonNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();

        int square = (int) Math.pow(num,2);
        int sum = 0;
        while (square > 0){
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if(num == sum){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not a Neon Number");
        }
    }
    public void strongNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int sum = 0,temp =num;
        while(num > 0){
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit ; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if(sum == temp){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }
    }
    public static void automorphicNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int square = (int) Math.pow(num,2);
        int temp = num,count = 0;
        while(temp > 0){
            count++;
            temp /= 10;
        }
        int power = (int) Math.pow(10,count);
        if(square % power == num){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not a Automorphic Number");
        }
    }
    public static void duckNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        boolean flag = false;
        while(num > 0){
            int digit = num % 10;
            if(digit == 0){
                flag = true;
            }
            num /= 10;
        }

        if(flag){
            System.out.println("Duck number");
        }else{
            System.out.println("Not a Duck Number");
        }
    }
}
