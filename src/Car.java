public class Car {
    int carId;
    String brand,model;
    double rentalPricePerDay;

    public void setCarId(int bo){
        carId = bo;
    }
    public int getCarId(){
        return carId;
    }
    public void setBrand(String t){
        brand = t;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String A){
        model = A;
    }
    public String getModel(){
        return model;
    }
    public void setRentalPricePerDay(Double D){
        rentalPricePerDay = D;
    }
    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    void displayDetails(){
        System.out.println("Car id :"+ getCarId() +" "+"Car Brand  : "+ getBrand()+" "+"Car Model"+ getModel()+" "+"car rental price per day"+ getRentalPricePerDay());
    }
}
