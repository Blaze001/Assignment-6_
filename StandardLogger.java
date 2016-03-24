/**
 * 
 */

/**
 * @author Mitchell VanEss
 *
 */
public abstract class StandardLogger implements Logger1 {

	
	
	/**
	 * 
	 */
	public StandardLogger() {
		// TODO Auto-generated constructor stub
		setLevel(Level.WARN);
	}
	
	
	@Override
	public void getLevel(String level) {
		return;
	}
	
	@Override
	/**
	 * @see Logger1#info
	 */
	public void info(String text){
		System.out.println("This is an info message");
	}
	
	@Override
	/**
	 * @see Logger1#debug
	 */
	public void debug(String text){
		System.out.println("This is a debug message");
	}
	
	@Override
	/**
	 * @see Logger1#warn
	 */
	public void warn(String text){
		System.out.println("This is a warning message");	
	}
	
	@Override
	/**
	 * @see Logger1#error
	 */
	public void error(String text){
		System.out.println("This is an error message");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

