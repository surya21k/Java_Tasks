public class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    // setters
    public void setAccountNumber(long Num){
        accountNumber = Num;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolderName(String Nam){
        accountHolderName = Nam;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setBalance(double bala) {
        balance = bala;
    }
    public double getBalance(){
        return balance;
    }
    String displayDetails(){

        return "Account Number : " + getAccountNumber() +" "+" Account Holder Name : " + getAccountHolderName() + " "+ "Account Balance : "+getBalance();
    }

}
