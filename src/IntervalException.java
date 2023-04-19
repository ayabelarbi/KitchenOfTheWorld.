public class IntervalException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6320494088667403317L;

	public IntervalException(String exception){
		super("Probleme de nombre: "+exception);
	}
}