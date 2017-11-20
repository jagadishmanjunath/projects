import java.util.Scanner;

public class Compare
{
    public static void main (String [] args)
    {
        int num1;
        int num2;

        Scanner in = new Scanner(System.in);

        System.out.println(" enter the number");
        num1 = in.nextInt();

        System.out.println(" enter the number");
        num2 = in.nextInt();

        if ( num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if ( num1 < num2)
        {
            System.out.println(num1 + "is less than"+ num2);
        }else
            {
                System.out.println(num1 + " is equal to " + num2);

            }
    }
}
