public class DivisionByZeroException extends Exception
{
    public DivisionByZeroException()
    {
        super();
        System.out.println("Its a no-argument constructor.");
    }

    public DivisionByZeroException(String message)
    {
        super(message);
        //System.out.println("Its an argument constructor.");
    }


}
