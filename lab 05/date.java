public class date{
	
	private int day; //1-31
	private int month; //1-12 
 	private int year;  // +ve

	date(){
		System.out.println("Constructor called");
		day=01;
		month=10;
		year=2026;
	}
	date(int day, int month, int year){
		this.setDay(day);
		setMonth(month);
		setYear(year);
	}
	date(int month, int year){
		this(1,month,year);
	}
	date(int year){
		this(1,year);
	}


	public void setDay(int day){
		if(day>=1&&day<=30)
			this.day=day;
	}
	public void setMonth(int month){
		if(month>=1&&month<=12)
			this.month=month;
	}
	public void setYear(int year){
		if(year>1)
			this.year=year;
	}

	public int getDay(){ return day;}
	public int getMonth(){return month;}
	public int getYear(){return year;}	

	public void displaydate(){
		System.out.printf("Date : %02d-%02d-%04d \n",day,month,year);
	}


}