import java.util.Scanner;
public class Conditional {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        billAmount();
        System.out.println();
        empSalary();
        System.out.println();
        Restaurant();
        System.out.println();
        atmMoney();


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
    public static void empSalary(){
        System.out.print("Enter Employee salary: ");
        int sal = scanner.nextInt();
        System.out.println("Salary: " + sal);
        EBC ebc = new EBC(sal);
        ebc.checkBonus();
        ebc.totalSalary();
    }
    public static void atmMoney(){
        System.out.print("Enter Account Balance: ");
        int amo = scanner.nextInt();
        System.out.print("Enter Withdrawal Amount :");
        int wit = scanner.nextInt();
        ATM atm = new ATM(amo,wit);
        atm.withDrawMoney();
        atm.balanceAmount();
    }
    public static void billAmount(){
        System.out.print("Original bill: ");
        int val = scanner.nextInt();
        EBD bill = new EBD(val);
        bill.Discount();

    }

}
