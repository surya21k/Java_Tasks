public class Employee {
    static int Salary = 30000;
    static int HRA = 5000;
    static int DA = 3000;
    public static void salaryDetails(){
        System.out.println("************** Employee Salary **************");
        System.out.println("Basic Salary: " + Salary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);

    }
    public static void grossSalary(){
        int gross = Salary + HRA + DA;
        System.out.println("Gross Salary: " + gross);
    }
    public static void main(String[] args){
        salaryDetails();
        grossSalary();
    }
}
