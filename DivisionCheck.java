import java.util.Scanner;

public class DivisionCheck
{




    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Numerator:");
        int num = scan.nextInt();
        System.out.println("enter Denominator");
        int denom = scan.nextInt();


        Calculator calc = new Calculator();
        int result = 0;

        try
        {
            result = calc.divide(num, denom);
        }
        catch (DivisionByZeroException e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidNumberException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Job done successfully");
        }

        System.out.println(result);



//        try
//        {
//            if (denom == 0)
//            {
//                throw new DivisionByZeroException("Division by zero is not allowed!");
//            }
//            else
//            {
//                result = num/denom;
//            }
//        }
//
//        catch(DivisionByZeroException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(result);

    }
}
