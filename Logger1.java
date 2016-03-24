/**
 * 
 */

/**
 * @author Mitchell VanEss
 *
 */

public interface Logger1 {
	void getLevel(String level);
		// TODO Auto-generated method stub
		
	 void setLevel(Level level);
		
	/**
	 * The info method prints the message when the level is set to INFO.
	 * @param text
	 */
	void info(String text);
	/**
	 * The debug method prints the message when the level is INFO or DEBUG.
	 * @param text
	 */
	void debug(String text);
	/**
	 * The warn method prints the message when the level is INFO, DEBUG or WARN.
	 * @param text
	 */
	void warn(String text);
	/**
	 * The error method always prints the message when called.
	 * @param text
	 */
	void error(String text);
	
}
