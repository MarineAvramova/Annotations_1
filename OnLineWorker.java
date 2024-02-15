
public class OnLineWorker extends Worker{
/*For online workers, the method to calculate their salary will receive to parameter 
 * the number of hours worked per month. When calculating the salary, 
 * the number of hours worked will be multiplied by the price/hour and
 *  the price of the flat Internet rate will be added, which will be a constant of the Online Worker class.*/
	
	private final int priceOfInternet = 60;

	public OnLineWorker(String name, String surname, int priceHour) {
		super(name, surname, priceHour);
		
	}

	@Override
	public int calculateSalary(int hoursWorked) {
		
		return super.calculateSalary(hoursWorked + priceOfInternet);
	}
	
	
}
