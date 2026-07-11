import java.util.Scanner;
public class SwitchMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main() {
        SGC();
        electricityBill();
        calculator();
        Restaurant();

    }

    private static void calculator() {

        System.out.print("Enter First Number :");
        int f = scanner.nextInt();
        System.out.print("Enter Second Number :");
        int s = scanner.nextInt();
        System.out.print("Enter Operator (+,-,*,/,%) :");
        String choice = scanner.next();
        Calculator c = new  Calculator();
        System.out.print("Result : ");
        float result = c.calCu(f,s,choice);
    }

    public static void SGC(){
        System.out.print("Enter Numbers of marks: ");
        int marks = scanner.nextInt();
        SGC sgc = new SGC();
        System.out.print("Grade: ");
        sgc.checkGrade(marks);
    }
    public static void electricityBill(){
        System.out.print("Enter Units Consumed: ");
        int u = scanner.nextInt();
        electricityCalculatorBill ebc = new electricityCalculatorBill();
        ebc.checkBill(u,0);
    }
    public static void Restaurant(){
        System.out.println("-------------Welcome To RMS Restaurant-----------");
        System.out.println("**** MENU ****");
        System.out.println("1. Pizza - ₹250");
        System.out.println("2. Burger - ₹150");
        System.out.println("3. Sandwich - ₹120");
        System.out.println("4. Coffee - ₹80");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice : ");
        int choice = scanner.nextInt();
        RMS rms = new RMS(choice);
        rms.Menu();
    }

}
