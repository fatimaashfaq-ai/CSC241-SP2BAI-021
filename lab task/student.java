class Student {
    String name;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Fatima";
        s1.age = 19;

        s1.display();
    }
}