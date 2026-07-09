
public class EBD {
    int originalBill;
    double finalBill;
    double discount;

    public EBD(int originalBill){
       this.originalBill = originalBill;
    }
    void checkDiscount(){
        if (originalBill > 5000){
            discount = originalBill * 20 / 100 ;
            System.out.println("discount: "+discount);
        }else if(originalBill >= 3000 && originalBill <= 5000){
            discount = originalBill * 10 / 100;
            System.out.println("discount: " + discount);
        }else {
            if(originalBill < 3000){
                System.out.println("No Discount");
            }
        }
    finalBill = originalBill - discount ;
    System.out.println("finalBill = " + finalBill);
    }
}
