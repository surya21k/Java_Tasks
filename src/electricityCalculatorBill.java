public class electricityCalculatorBill {
    public void checkBill(int units,int total){
        if(units <= 100){
            total = units *= 2;
            System.out.println("Total Bill = " + total);
        }else if(units >100 && units <=200){
            total = units *= 3;
            System.out.println("Total Bill = " + total);
        }else{
            if(units >200){
                total = units *=5;
                System.out.println("Total Bill = " + total);
            }else{
                System.out.println("Units cannot be Negative");
            }
        }



    }
}

