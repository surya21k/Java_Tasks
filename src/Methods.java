public class Methods {
    public static class Student{
        String studentName = "Prasanna";
        int studentId = 101;
        static String collegeName = "SRU";
        public static void collegeInfo(){
            Student student = new Student();
            System.out.println(student.studentName);
            System.out.println(student.studentId);
            System.out.println(Student.collegeName);
        }
        public void studentInfo(){
            System.out.println(studentName);
            System.out.println(studentId);
            System.out.println(Student.collegeName);
        }
        public static void main(String[] args){
            collegeInfo();
            Student student = new Student();
            student.studentInfo();
        }
    }
    public class Mobile{
        static String brand;
        int model;
        int price;

        public static void brandInfo(){

        }

    }

}
