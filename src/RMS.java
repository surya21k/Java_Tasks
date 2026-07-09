public class RMS {
    int choice;
    public RMS(int choice){
        this.choice = choice;
    }
    public void checkMenu(){
        switch (choice) {
            case 1:
                System.out.println("You Selected : Pizza");
                System.out.println("Price : ₹250");
                break;
            case 2:
                System.out.println("You Selected : Burger");
                System.out.println("Price : ₹150");
                break;
            case 3:
                System.out.println("You Selected : Sandwich");
                System.out.println("Price : ₹120");
                break;
            case 4:
                System.out.println("You Selected : Coffee");
                System.out.println("Price : ₹80");
                break;
            case 5:
                System.out.println("Exiting... Thank you!");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
