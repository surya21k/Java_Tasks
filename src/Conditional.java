import java.util.Scanner;
public class Conditional {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        billAmount();
        System.out.println();
        empSalary();
        System.out.println();
        atmMoney();
        System.out.println();
        loginAuth();

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
    public static void loginAuth(){
        System.out.print("Username  = ");
        String user = scanner.nextLine();
        System.out.print("Password = ");
        String user1 = scanner.nextLine();
        loginAuthentication Auth = new loginAuthentication();
        Auth.setUserName("admin");
        Auth.setPassword("1234");
        if (Auth.authenticate(user, user1)) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Invalid Username or Password.");
        }

    }
}
