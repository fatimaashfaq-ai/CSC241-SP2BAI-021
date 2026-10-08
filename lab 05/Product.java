public class Product {

   private static int count = 1;
  static  double max;
  static double min;
    date expirydate;

   private String id;
   private String name;
  private  double price;
  private  int quantity;

    Product(String name, double price, int quantity, date expirydate ) {
        
        id = String.format("P%03d", count);
        count++;
        this.id= id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirydate = expirydate;


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
        System.out.println("Expiry Date: " );
         expirydate.displaydate();
    }
}
