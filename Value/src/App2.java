import model.Product;

public class App2 {

    public static void main(String[] args) 
    {
        // primitive types -> assignment by value
        // byte, short, int, long
        // double, float
        // boolean
        // char

        // The value of 'a' is passed to 'b', it means that a new memory address is created to 'b'
        int a = 1;
        int b = a;

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

        // objects -> assignment by reference
        // The value of 'p2' is a reference to 'p1', this means that p1 and p2 has the same memory address
        Product p1 = new Product("Pencil", 5.99);
        Product p2 = p1;

        p2.name = "Pen";
        System.out.println(p1.name);
    }
}
