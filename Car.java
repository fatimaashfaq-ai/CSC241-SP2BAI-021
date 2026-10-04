class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.year = 2024;

        c1.displayInfo();
    }
}