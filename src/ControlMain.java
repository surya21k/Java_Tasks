import java.util.Scanner;
public class ControlMain{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        printNaturalNumbers( 10);
        System.out.println();
        multiTable(5);
        System.out.println();
        sumNaturalNumbers(20);
        System.out.println();
        factorialNumber(5);
        System.out.println();
        System.out.print("Enter a Limit = ");
        int n = scanner.nextInt();
        oddEvenNumbers(n);
        System.out.println();
        subMarks(5);
    }
    public static void printNaturalNumbers(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
    }

    public static void multiTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d",num,i,num * i);
        }
    }

    public static void sumNaturalNumbers(int num){
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
    }

    public static void factorialNumber(int num){
        int Factorial = 1;
        for (int i = num; i >= 1 ; i--) {
             Factorial = Factorial * i;
        }
        System.out.println("Factorial = " + Factorial);
    }

    public static void oddEvenNumbers(int num){
        System.out.print("Even Numbers ");
        for (int i = 2; i < num ; i += 2) {
            System.out.print(i+" ");
        }
        System.out.print("Odd Numbers ");
        for (int i = 1; i < num ; i += 2) {
            System.out.print(i+" ");
        }

    }
    public static void subMarks(int num){
        int [] Marks = new int[num];
        int totalMarks = 0;
        for (int i = 0; i < num ; i++) {
            System.out.printf("Enter Marks of Subject %d : ",i + 1);
            Marks[i] = scanner.nextInt();
            totalMarks += Marks[i];
        }
        System.out.println("Total Marks "+totalMarks);
        float avgMarks = (float) totalMarks / num;
        System.out.println("Averager Marks = " + avgMarks);
    }

}
