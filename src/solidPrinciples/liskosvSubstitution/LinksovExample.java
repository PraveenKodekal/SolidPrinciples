package solidPrinciples.liskosvSubstitution;


/**
 * @author praveen through tekCreek Youtube Channel
 * @implNote LInksov-Substitution Principle
 * {@summary} it states that the parent class value can replaced/sustituted with child class values
 *
 */

/**
 * inthe following example testDrive the parent class implementations are also replaced with 
 * child class implementations
 *
 */
public class LinksovExample {
	
	public static void testDrive(Vehicle vehicle) {
		vehicle.start();
		vehicle.stop();
	}
	
	public static void main(String[] args) {
		
		LinksovExample.testDrive(new Vehicle());
		LinksovExample.testDrive(new Bike());
		LinksovExample.testDrive(new Car());
	}

}


/**
 * parent class has two functionalities
 * start() and stop() the vehicle
 */
class Vehicle{
	
	public void start() {
		System.out.println("Vehicle started");
	}
	

	public void stop() {
		System.out.println("Vehicle stopped");
	}
}


class Bike extends Vehicle{
	
	public void start() {
		System.out.println("Bike started");
	}
	

	public void stop() {
		System.out.println("Bike stopped");
	}
}

class Car extends Vehicle{
	
	public void start() {
		System.out.println("Car started");
	}
	

	public void stop() {
		System.out.println("Car stopped");
	}
}