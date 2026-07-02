public class BankApplication {
    static void main(String[] args) {
        BankAccount BA = new BankAccount();
        BA.setAccountHolderName("Surya");
        BA.setAccountNumber(12345);
        BA.setBalance(300000.00);
        System.out.println(BA.displayDetails());
    }
}
