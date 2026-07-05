public class variablesMethods {
   public static void main(String[] args){
       add(10,20);
       sub(20,30);
       mul(10,20);
       div(20,10);
   }
    public static class Employee{
       public static int Value = 9;
       public static double Salary = 10.00;
       String Name = "surya";
       boolean isMale = true;

       public static void main(String[] args){
           Employee employee1 = new Employee();
           Employee employee2 = new Employee();
           System.out.println(employee2.isMale);
           System.out.println(employee2.Name);
           System.out.println(employee1.Value);
           System.out.println(employee1.Salary);
       }
   }
   public static void add(int a ,int b){
       System.out.println(a+b);
   }
   public static void sub(int a,int b){
       System.out.println(a-b);
   }
   public static void mul(int a ,int b){
       System.out.println(a*b);
   }
   public static void div(int a ,int b){
       if(b != 0){
           System.out.println(a/b);
       }
       else{
           System.out.println("Cannot divide by zero");
       }

   }
   public static class School{
       public static String schoolName = "ABJ ABDUL KALAM HIGH SCHOOL";
       public  String studentName = "Surya";
       int rollNo = 121;
       int marks = 97;
       void displayDetails(){
           System.out.println("School Name: " +schoolName+"\nStudent Name: "+studentName+"\nRoll no: "+rollNo+"\nMarks: "+marks);
       }
       public static void main(String[] args){
          School school = new School();
          school.displayDetails();

       }
   }
}
