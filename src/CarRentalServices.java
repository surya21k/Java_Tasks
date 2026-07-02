public class CarRentalServices {
    static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.setCarId(1);
        c1.setBrand("BMW");
        c1.setModel("sedan");
        c1.setRentalPricePerDay(100.00);
        c1.displayDetails();
    }
}
