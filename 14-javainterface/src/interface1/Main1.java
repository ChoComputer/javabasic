package interface1;

public class Main1 {
	public static void main(String[] args) {
        
		Vehicle c =new Car("???");

	    //Vehicle v =new Vehicle("vvv");
	
		c.accel();
		c.accel();
		c.accel();
		c.breakSpeed();
		c.breakSpeed();
		c.breakSpeed();
		c.reFuel();
		c.showStatus();
		
		Car c1 =new Car("aaa");
		
		c1.accel();
		c1.accel();
		c1.accel();
		c1.breakSpeed();
		c1.reFuel();
		c1.showStatus();
	
	}

}
