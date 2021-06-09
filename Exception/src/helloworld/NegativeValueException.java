package helloworld;

	@SuppressWarnings("serial")
	public class NegativeValueException extends Exception
	{
	    public NegativeValueException()
	    {
	        super();
	    }
	    public NegativeValueException(double value)
	    {
	        super("Negative Value: " + value);
	    }
	}

