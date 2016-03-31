/**
 * 
 */

/**
 * @author Mitchell VanEss
 *
 */
public class StandardLogger implements Logger1 {

	Level level;
	
	/**
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * 
	 */
	public StandardLogger() {
		// TODO Auto-generated constructor stub
		setLevel(Level.INFO);
	}

	@Override
	/**
	 * @see Logger1#info
	 */
	public void info(String text){
		if (level == Level.INFO){
		System.out.println(text);
		}
	}
	
	@Override
	/**
	 * @see Logger1#debug
	 */
	public void debug(String text){
		if (level == Level.INFO || level == Level.DEBUG){
		System.out.println(text);
		}
	}
	@Override
	/**
	 * @see Logger1#warn
	 */
	public void warn(String text){
		if (level == Level.INFO || level == Level.DEBUG || level == Level.WARN) {
			System.out.println(text);	
		}
		
	}
	
	@Override
	/**
	 * @see Logger1#error
	 */
	public void error(String text){
		System.out.println(text);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
