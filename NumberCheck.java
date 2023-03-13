import java.util.Scanner;
public class NumberCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 5 and 15:");
        int num = scan.nextInt();
        try
        {
            if (num >= 5 && num <= 15) {
                System.out.println("Good job");
            } else {
                throw new InvalidNumberException("Hey, do not give me invalid number.");
            }
        }

        catch(InvalidNumberException e)
        {
            //System.out.println("Its an invalid Number");
            System.out.println(e.getMessage());
        }
    }

}
