import java.util.Scanner;
public class Mobile {
    public static String Brand;
    public static String Model;
    public static int Price;
    public static void brand(String q ,String w,int z){
           Brand = q;
           Model = w;
           Price = z;
    }
    public static void brandInfo(){
        System.out.println("Brand :"+Brand);
        System.out.println("Model :"+Model);
        System.out.println("Price :"+Price);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String q = scanner.nextLine();
        String w = scanner.nextLine();
        int z = scanner.nextInt();
        brand(q,w,z);
        brandInfo();
    }
}
