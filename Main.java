
public class Main {

	public static void main(String[] args) {
		
		OnLineWorker onlineWorker = new OnLineWorker("Stella", "McCartney", 45);
		OnSiteWorker onsiteWorker = new OnSiteWorker("Poppy", "Fei", 32);
		
	
		System.out.println("Online worker example of @Override annotation is: " + onlineWorker.calculateSalary(40));
		System.out.println("Online worker example of @Override annotation is: " + onsiteWorker.calculateSalary(40));
		

	}

}
