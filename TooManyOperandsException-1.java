
public class TooManyOperandsException extends Exception {
	String s;
	
	public TooManyOperandsException () {
		s = null;
	}
	public TooManyOperandsException (String s) {
		super(s);
	}
}
