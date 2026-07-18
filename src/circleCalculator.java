import java.util.Scanner;
public class circleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int we = scanner.nextInt();
        calculateCircleArea(we);
    }
    public static void calculateCircleArea(int radius){
        double Area = Math.PI * radius * radius;
        System.out.printf("CIRCLE AREA : " + Area);
    }

}
