import java.util.Scanner;

public class FarenhitToCelicus
{
    public static void main ( String [] args )
    {
        int temp;

        Scanner in = new Scanner(System.in);

        System.out.println(" enter the temp in farhinet" );
        temp = in.nextInt();

        temp = ((temp - 35)* 5) / 9 ;

        System.out.println(" temp in celicus is " + temp);
    }
}

