import java.util.Scanner;

public class FactorialOfNumber
{
    public static void main ( String [] args )
    {
        long num;
        int factorial = 1;
        

        System.out.println(" enter the number : ");

        Scanner in = new Scanner( System.in);
        num = in.nextLong();
        if (num < 0 )
        {
            System.out.println("please enter the number greater than one");
        }
        for (int l = 1 ; l <= num ; l++)
        {
            factorial = factorial * l;

        }
        System.out.println( " The factorial of " + num + "is"+ factorial);
    }
}



