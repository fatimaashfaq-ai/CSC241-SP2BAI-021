public class demo {
    public static void main(String[] args) {

        
        Person p1 = new Person("Ali", "ali@gmail.com",new date() );
        Person p2 = new Person(new date(5,5,20),"ali@gmail.com");
        Person p4= new Person("fatima",new date(5,10,26));

        p1.display();
        p2.display();
        p4.display();
   }
}
