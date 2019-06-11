import abst.BikeFactory;
import abst.Body;
import abst.SamFactory;
import abst.Wheel;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		
		body.body1();
		wheel.wheel1();
		
		System.out.println("\n\n=======================");
		System.out.println("충돌");
		System.out.println("1234567890");
		System.out.println("1234567890");
	}

}
