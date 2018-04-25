
public class TimeFormatException extends Exception
{
	public TimeFormatException( )
    {
        super("This is an incorrect Time");
    }
	
    public TimeFormatException(String message)
    {
        super(message);
    }

}
