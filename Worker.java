
public class Worker {
/*The Worker class has the attributes first name, last name, price/hour, 
 * and the calculateSalary() method which receives as a parameter the number of hours worked 
 * and multiplies it by the price/hour. Child classes must override it, using @Override.*/
	
	
	private String name;
	private String surname;
	private int priceHour;
	
	
	public Worker(String name, String surname, int priceHour) {
		this.name = name;
		this.surname = surname;
		this.priceHour = priceHour;
	}


	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}


	public int getPriceHour() {
		return priceHour;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public void setPriceHour(int priceHour) {
		this.priceHour = priceHour;
	}
	
	public int  calculateSalary( int hoursWorked) {
		int salary = 0;
		salary = hoursWorked * priceHour;
		return salary;
	}
}
