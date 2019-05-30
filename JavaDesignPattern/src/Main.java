import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import sam.SamFactory;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		body.body1();
		wheel.wheel1();
	}

}
