public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // setters
    public void setProductId(int ID){
        productId = ID;
    }
    // getter
    public int getProductId(){
        return productId;
    }
    public void setProductName(String name){
        productName = name ;
    }
    public String getProductName(){
        return productName;
    }
    public void setPrice(double pric){
        price = pric;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quan){
        quantity = quan;
    }
    public int getQuantity(){
        return quantity;
    }
    void displayDetails(){
        System.out.println("Product ID : " + productId +" "+ "Product Name : "+productName+" "+"Product price: "+ " " + price +" "+"Available Quantity : "+quantity);
    }
}
