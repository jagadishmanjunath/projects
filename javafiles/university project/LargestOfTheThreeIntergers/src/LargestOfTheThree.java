import java.util.Scanner;

public class LargestOfTheThree
{
    public static void main (String [] args)
    {
        int numOne,numTwo,numThree;

        System.out.println( " enter the numbers ");
        Scanner in = new Scanner(System.in);
        numOne = in.nextInt();
        numTwo = in.nextInt();
        numThree = in.nextInt();

        if ( numOne > numTwo && numOne > numThree)
        {
            System.out.println(numOne + " is largest than all the number");
        }
        else if ( numTwo > numOne && numTwo > numThree)
        {
            System.out.println(numTwo + " is largest than all the number");
        }
        else if (numThree > numOne && numThree > numTwo)
        {
            System.out.println(numThree + "is largest than all the number");
        }

    }
}
