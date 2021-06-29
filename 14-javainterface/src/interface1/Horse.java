package interface1;

public class Horse implements Vehicle{
	
	private int tire;
	private int speed;
	private String name;

	public Horse(String name) {
		this.name=name;
		this.speed=0;
		this.tire=0;
		
	}
	
	@Override
	public void accel() {
		if(speed+10<=200) {
			speed +=10;
			
		}else{this.speed=200;}
		this.tire +=5;
		System.out.println("이랴~!");
		
	}

	@Override
	public void breakSpeed() {
		if(speed-20>0) {
			this.speed-=20;
		}else {
			this.speed=0;
		}
		System.out.println("워워~");
		
	}

	@Override
	public void reFuel() {
		
		
		if(tire<=MAX_GAS&&tire-20>0) {
			tire -=15;
		}else if(tire-20<=0) {
			tire=0;
		}
		System.out.println("좀 쉬자");
		
	}

	@Override
	public void showStatus() {
		System.out.printf("마주 : %s\n 마속 : %d\n  피로도 : %d",name,speed,tire);
		
	}
	
	

}
