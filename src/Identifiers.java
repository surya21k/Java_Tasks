public class Identifiers {
    public static void main(String[] args){

        // Task - 1
        String studentName;// identifier because it is a camel case
        int _student; // valid because it starts with a Underscore
        //int 123name;Not valid because it starts with symbol
        double total_marks; // valid
        //int class; not valid because its key word but Class is valid

        double $salary;// valid
//        String first-name; not valid
        String Name123;//valid

        //Task - 2
        int name123;//now valid
        String student_Name; //valid
        char Class;
        double employeeSalary; //valid identifier now
        double marks;

         Task - 3
        String studentName = "Surya";
        int studentAge = 21;
        int studentPercentage = 96;
        double employeeSalary = 500000.00;
        boolean isPassed = true;
        System.out.println("Student Name: "+studentName +"\nStudent Age: " +studentAge+"\nStudent Percentage: "+studentPercentage+"%\nEmployee Salary: "+employeeSalary+"\nis Passed: "+isPassed);

         Task -4
         int 123age = 20;
        int age123 = 20;
        //double employee-salary = 25000;
        double employeeSalary = 25000;
        //boolean class = true;
        boolean Class = true;
        char grade = 'A';

//        Task - 5
        // Rule -1 : identifier can't start with a digit
        int age1;
        //rule 2 : identifier cannot be a reserved keyword
        boolean Class;
        //rule 3 : identifier can't contain sppecial character except _ and $
        boolean is_Passed = false;
        int $salary = 377;
        //rule 4 : starts with number or _ or $
        int name124;
        String _student;
        float $amount;
        //rule 5 : case sensitive
        int Age;
        int age;
    }
}
