package Assignment_on_OOP_Concepts.Q6;

public class ParkingMeter {
	int timeLeft=0 ;
	int maxTime ;
	
	
	public ParkingMeter(int maxTime) {
		super();
		this.maxTime = maxTime;
	}
	
	public boolean add(int a) {
		
		if(a==25 && (timeLeft+30)<maxTime) {
			timeLeft=timeLeft+30;
			return true;
		}
		return false;
	}
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft--;
		}
	}
	
	public boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}
		return false;
	}
	
	
}
