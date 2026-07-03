public class Operators {
    //Task 1
    public static void arithmeticOperators(int a , int b){
        try {
            System.out.printf("Addition of A : %d and B : %d is: %d \n", a, b, (a + b));
            System.out.printf("Subtraction of A : %d and B : %d is: %d \n", a, b, (a - b));
            System.out.printf("Multiplication of A : %d and B : %d is: %d \n", a, b, (a * b));
            if (b != 0) {
                System.out.printf("Division of A : %d and B : %d is: %d \n", a, b, (a / b));
            }
            System.out.printf("Remainder of A : %d and B : %d is: %d \n", a, b, (a % b));
        }catch(ArithmeticException e){
            System.out.println("B Cannot be Zero ");
        }
    }
    // Task - 2
    public static void incrementDecrement(int a){
        //pre-increment
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
    // task 3
    public static void comparisionOperators(int a , int b){
        if(a == b){
            System.out.println("Both Student Marks are Equal");
        } else if (a < b) {
            System.out.println("B has more marks than A");
        } else if (a > b) {
            System.out.println("A has More marks than B");
        }

        System.out.println("A is not equals to B:" +(a != b));
        System.out.println("A is less than or equals to B:" +(a <= b));
        System.out.println("A is greater than or equals to B:" +(a >= b));

    }
    // task 4
    public static void assignmentOperators(int a){
        a += 10;
        System.out.println("a+= : " + (a += 10));
        System.out.println("a-= : " + (a -= 10));
        System.out.println("a*= : " + (a *= 10));
        System.out.println("a/= : " + (a /= 10));
        System.out.println("a%= : " + (a %= 10));
    }

    // task - 5

    public static void employeeSalary(int Basic_Salary,int HRA,int DA){
        System.out.println("Basic Salary : " + Basic_Salary);
        int grossSalary = Basic_Salary + HRA + DA;
        if(grossSalary > 50000){
            grossSalary += 5000;
            System.out.println("grossSalary : " + grossSalary);
        }else{
            System.out.println("Gross Salary : " + grossSalary);
        }

    }
}
