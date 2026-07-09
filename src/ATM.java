public class ATM {

    int amount;
    int withDrawAmount;
    int balance;

    public ATM(int amount,int withDrawAmount){
        this.amount = amount;
        this.withDrawAmount = withDrawAmount;
    }
    public void withDraw(){
        if(amount > 0 && amount > withDrawAmount){
            amount -= withDrawAmount;
            System.out.println("Transaction Successful");
        }else if(amount < withDrawAmount) {
            System.out.println("Insufficient balance!");
        }else if(withDrawAmount < 0){
            System.out.println("WithDraw amount Can't be negative");
        }
    }
    public void balanceAmount(){
        balance = amount;
        System.out.println("balance = " + balance);
    }
}
