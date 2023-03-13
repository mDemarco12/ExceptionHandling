public class Calculator
{
    public int divide(int x, int y) throws DivisionByZeroException, InvalidNumberException
    {

        if (y == 0)
        {
            throw new DivisionByZeroException("Its not allowed!");
        }

        else if(y < 0)
        {
            throw new InvalidNumberException("Only positive denominator, please!");
        }

        else
        {
            return x / y;
        }

    }

}
