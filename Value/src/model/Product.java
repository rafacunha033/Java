package model;

public class Product {
    public String name;
    public double price;
    public static double discount = 0.0; 

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public double priceWithDiscount() 
    {
        return price * (1 - discount);
    }
}
