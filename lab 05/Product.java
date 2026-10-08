public class Product {

    static int count = 1;
 static  double max;
    static double min;

    String id;
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        
        id = String.format("P%03d", count);
        count++;

        this.name = name;
        this.price = price;
        this.quantity = quantity;

        
        if (count == 2) {
            max = price;
            min = price;
        }
        else {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }
    }

    void displayProduct() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
