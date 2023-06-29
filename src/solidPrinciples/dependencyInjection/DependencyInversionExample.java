package solidPrinciples.dependencyInjection;

/**
 * @implNote create the abstaction interface for logger and its Implementation class.
 * then use the logger implementation as a private variable and inject through constructor Injection.
 *
 */
public class DependencyInversionExample {
	
	private LoggerImpl loggers;
	
	public DependencyInversionExample(LoggerImpl loggers) {
		this.loggers= loggers;
	}
	
	public void addUser() {
		System.out.println("User Saved to DB");
		
		loggers.logger();
	}
	public static void main(String[] args) {
		DependencyInversionExample de= new DependencyInversionExample(new LoggerImpl());
		de.addUser();
	}

}

interface ILogger{
	public void logger();
}

class LoggerImpl implements ILogger{

	@Override
	public void logger() {
		// TODO Auto-generated method stub
		System.out.println("Logger Implementation Done");
	}
	
}
