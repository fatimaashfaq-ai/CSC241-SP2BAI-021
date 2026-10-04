class Person {
   
   private String name;
   private String email;
   private date dob;
    

    
  public Person(String name, String email, date dob) {
        this.name=name;
        this.email = email;
        this.dob = dob;
	 
    }
 
  
    public Person(date dob, String email) {
        this.dob=dob;
        this.email=email;

    }

   public Person( String name,date dob){
    this.name=name;
    this.dob=dob;
     
}

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        dob.displaydate();        
        System.out.println();
    }
}
