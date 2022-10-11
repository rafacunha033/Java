import model.Product;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Product p1 = new Product("eraser", 2.99, 0.2);
        Product p2 = new Product("refrigerator", 2000.99, 0.35);

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.priceWithDiscount());
        System.out.println(p2.priceWithDiscount());
    }
}
