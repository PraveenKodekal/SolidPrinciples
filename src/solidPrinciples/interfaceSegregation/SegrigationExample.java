package solidPrinciples.interfaceSegregation;

/**
 * @implNote This following example illustrates the Interface Segregation Principle
 *
 */
public class SegrigationExample {
	
	public static void main(String[] args) {
		
		veg v= new veg();
		v.vegMeals();
		
		nonveg n= new nonveg();
		n.NonvegMeals();
		
		bothMeals b= new bothMeals();
		b.vegMeals();
		b.NonvegMeals();
		
	}

}

interface vegResto{
	public void vegMeals();
}

interface NonVegResto{
	public void NonvegMeals();

}


class veg implements vegResto{

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		System.out.println("Veg Resto");
	}
	
}

class nonveg implements NonVegResto{

	@Override
	public void NonvegMeals() {
		// TODO Auto-generated method stub
		System.out.println("NonVeg Resto");
	}
	
}
class bothMeals implements vegResto, NonVegResto{

	@Override
	public void NonvegMeals() {
		// TODO Auto-generated method stub
		System.out.println("Both-NonVeg");
		
	}

	@Override
	public void vegMeals() {
		// TODO Auto-generated method stub
		System.out.println("Both-Veg");
	}
	
}