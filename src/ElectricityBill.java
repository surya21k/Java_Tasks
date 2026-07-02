public class ElectricityBill {
    static int Units_Consumed = 250;
    static int Cost_per_Unit = 8;

    int unitDetails(){
        System.out.println("************ Electricity Bill ************");
        System.out.println("Units Consumed: " +Units_Consumed);
        System.out.println("Cost Per Unit: " + Cost_per_Unit);

        return 0;
    }
    public static void calculateBill(){
        int total = Units_Consumed * Cost_per_Unit;
        System.out.println("Total Bill : " + total);
    }
    public static void main(String[ ] args){
        ElectricityBill EB = new ElectricityBill();
        EB.unitDetails();
        calculateBill();
    }
}
