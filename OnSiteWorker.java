
public class OnSiteWorker extends Worker{
/*In the case of OnSite workers, the method to calculate their salary 
 * will receive as a parameter the number of hours worked per month. 
 * When calculating the salary, the number of hours worked will be multiplied by the price/hour, 
 * plus the value of a static attribute called petrol that we will add in this class.*/
	
	private static final int VALUE_OF_PETROL = 200;

	public OnSiteWorker(String name, String surname, int priceHour) {
		super(name, surname, priceHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary(int hoursWorked) {
		// TODO Auto-generated method stub
		return super.calculateSalary(hoursWorked +  VALUE_OF_PETROL);
	}

	
	
}
