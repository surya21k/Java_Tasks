public class ShoppingCart {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setProductName("Belt");
        p1.setPrice(139.99);
        p1.setProductId(1);
        p1.setQuantity(2);
        p1.displayDetails();
    }
}
