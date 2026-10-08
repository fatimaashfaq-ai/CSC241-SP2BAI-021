public class Demo {

    public static void main(String[] args) {
           date d1 = new date(5, 10, 26);
        date d2 = new date(6, 10, 26);
        date d3 = new date(7, 10, 26);

        Product p1 = new Product("Pen", 50.0, 10,d1);
        Product p2 = new Product("Book", 500.0, 5,d2);
        Product p3 = new Product("Bag", 20.0, 2,d3);
       

        
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
      


        System.out.println("Maximum Price: " + Product.max);
        System.out.println("Minimum Price: " + Product.min);
    }
}