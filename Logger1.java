\**
 * 
 */

/**
 * @author Mitchell VanEss
 *
 */

public interface Logger1 {
	public Level getLevel();
		// TODO Auto-generated method stub
		
	public void setLevel(Level level);
		
	/**
	 * The info method prints the message when the level is set to INFO.
	 * @param text
	 */
	public void info(String text);
	/**
	 * The debug method prints the message when the level is INFO or DEBUG.
	 * @param text
	 */
	public void debug(String text);
	/**
	 * The warn method prints the message when the level is INFO, DEBUG or WARN.
	 * @param text
	 */
	public void warn(String text);
	/**
	 * The error method always prints the message when called.
	 * @param text
	 */
	public void error(String text);
	
}




	
