import java.util.Scanner;

public class LeapYear
{
    public static void main (String [] args)
    {
        int year;
        Scanner in = new Scanner(System.in);

        System.out.println("enter the year");
        year = in.nextInt();

        if ((year % 400 == 0) || (year % 4==0 && year % 100 != 0 ))
        {
            System.out.println( year +" is a leap year");
        }
        else
            {
                System.out.println(year + " not a leap year");
            }

    }
}
