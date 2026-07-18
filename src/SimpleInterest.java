import java.util.Scanner;
public class SimpleInterest {
    public void SI(int p ,int r,int t){
        double simpleInterest = (p*t*r)/100;
        System.out.println(simpleInterest);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleInterest si = new SimpleInterest();
        int p = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        si.SI(p,t,r);
    }
}
