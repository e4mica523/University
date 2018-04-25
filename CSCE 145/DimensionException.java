
public class DimensionException extends Exception
{
	public DimensionException( )
    {
        super("This is an invalid dimension");
    }
	
    public DimensionException(String message)
    {
        super(message);
    }

}
