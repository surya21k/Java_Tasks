public class dataTypes {

        byte age = 20;
        short marks = 500;
        int salary = 25000;
        long population = 1400000000L;
        float percentage = 85.5f;
        double pi = 3.14159265359;
        char grade = 'A';
        boolean isPassed = true;

    void displayDetails(){
        System.out.println(
                "Age: " + age +
                        ",\n Marks: " + marks +
                        ",\n Salary: " + salary +
                        ",\n Population: " + population +
                        ",\n Percentage: " + percentage +
                        ",\n Pi: " + pi +
                        ",\n Grade: " + grade +
                        ",\n Passed: " + isPassed
        );
    }
    void HMS(){
        int patientAge = 10;
        String patientName = "Sristi";
        char gender = 'F';
        boolean isActivePatient = true;
        String diseaseName = "Lung infection";
        System.out.println("\n");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + patientAge);
        System.out.println("Gender: " + gender);
        System.out.println("Active: " + isActivePatient);
        System.out.println("Disease: " + diseaseName);
    }
    public static void main(String[] args){
        dataTypes variables = new dataTypes();
        variables.displayDetails();
        variables.HMS();


    }
}
