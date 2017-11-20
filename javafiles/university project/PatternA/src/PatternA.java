import java.util.Scanner;

public class PatternA
{
    public static void main ( String [] args)
    {
        int n;

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        for (int i = 1; i < n ; i++)
        {
            for (int j= 0; j < i ; j++)
            {
                System.out.print("*");
            }
          System.out.println("1");
        }

    }
}
