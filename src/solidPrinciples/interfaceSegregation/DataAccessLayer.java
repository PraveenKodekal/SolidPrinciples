package solidPrinciples.interfaceSegregation;


/**
 * @author Praveen via INterviewHappy youtube channel
 * Dependency Inversion Principle 
 * It states that the high level module of the application should not dependent on the lower level modules.
 * In the below dataAccessLayer data adding to the DB is high level module where as logging is low level module
 * both are tightly coupled which did not follow the Dependency Inversion Principle.
 * 
 *
 */
public class DataAccessLayer {
	public void addUser() {
		//functionality to add the user to DataBase
		System.out.println("UserAdded");
		
		//Logger message to implement logging in application level
		System.out.println("Application Level Loggers Implemented ");
	}
	
	
	public static void main(String[] args) {
		DataAccessLayer db= new DataAccessLayer();
		db.addUser();
	}
}