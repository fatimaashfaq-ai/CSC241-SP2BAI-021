public class Demo {

    public static void main(String[] args) {

        Product p1 = new Product("Pen", 50.0, 10);
        Product p2 = new Product("Book", 500.0, 5);
        Product p3 = new Product("Bag", 20.0, 2);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        System.out.println("Maximum Price: " + Product.max);
        System.out.println("Minimum Price: " + Product.min);
    }
}