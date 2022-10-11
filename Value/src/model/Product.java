package model;

public class Product {
    public String name;
    public double price;
    public double discount; 

    public Product(String name, double price, double discount) 
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double priceWithDiscount() 
    {
        return price * (1 - discount);
    }
}
