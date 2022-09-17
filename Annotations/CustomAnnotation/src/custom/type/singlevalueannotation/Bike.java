package custom.type.singlevalueannotation;

public class Bike {
	
	@RunAfterStart(times=3, speed= {20, 40, 60})
	public void start() {
		System.out.println("Bike started");
	}
	
	public void accelerate() {
		System.out.println("Bike started");
	}
	
	public void stop() {
		System.out.println("Bike started");
	}
	
}
