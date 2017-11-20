import java.util.Scanner;

public class RatingSystem
{
    public static void main ( String [] args)
    {
        int rating;

        Scanner in = new Scanner (System.in);
        System.out.println( " enter the number depending on the movie");
        rating = in.nextInt();

        switch (rating)
        {
            case 1 :
                System.out.println("*");
                System.out.println("worst");
                break;
            case 2 :
                System.out.println("**");
                System.out.println("bad");
                break;
            case 3 :
                System.out.println("***");
                System.out.println("Average");
                break;
            case 4 :
                System.out.println("****");
                System.out.println("good");
                break;
            case 5 :
                System.out.println("*****");
                System.out.println("Excellent");
                break;
        }
    }
}
