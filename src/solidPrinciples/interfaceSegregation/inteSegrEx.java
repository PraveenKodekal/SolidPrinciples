package solidPrinciples.interfaceSegregation;

/**
 * @author Praveen via tekCreek channel Following example is not following
 *         Interface Segregation Principle
 */


public class inteSegrEx {

	public static void main(String[] args) {
		restuarant rest= new VegRest();
		rest.vegMeals();   
		rest.nonvegMeals(); // Not necessary Implementation
		
		restuarant restNon= new NonvegRest();
		restNon.vegMeals();   // NOt Necessary Implementation
		restNon.nonvegMeals();
	}

}

/**
 * it states that client should not force to implement the interface which is not in use
 * In the following Interface Restaurant has vegMeals and Non veg Meals Functionality
 * veg Restaurant implemented restaurant interface and implemented both veg and nonveg functionality
 * The nonveg functionality for vegRestaurent and veg funtionality for non veg Restaurant id not used.
 *Hence The principlr states that separate the interfaces according to the functionalities
 */
interface restuarant{
	public void vegMeals();
	public void nonvegMeals();
	
}


class VegRest implements restuarant{

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		System.out.println("Veg Restaurant");
	}

	@Override
	public void nonvegMeals() {
		// TODO Auto-generated method stub
		System.out.println("NonVeg Not Avilable");
	}
	
}

class NonvegRest implements restuarant{

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		System.out.println("Veg Meals Not available");
	}

	@Override
	public void nonvegMeals() {
		// TODO Auto-generated method stub
		System.out.println("NonVeg Meals Only");
	}
	
}