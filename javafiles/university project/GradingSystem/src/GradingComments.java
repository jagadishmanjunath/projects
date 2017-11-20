import java.util.Scanner;

public class GradingComments
{
    public static void main (String [] args)
    {
        String n;

        Scanner in = new Scanner(System.in);

        System.out.println(" Enter the grade of the student:");
        
        n = in.nextLine();

        switch (n)
        {
            case "A" :
                System.out.println("you're, doing a great work");
                break;
            case "B" :
                System.out.println(" you can do little better");
                break;
            case "C" :
                System.out.println(" you can do better");
                break;
            case "D" :
                System.out.println(" you can still move ahead buddie");
                break;
            case "E" :
                System.out.println(" you , are just near to pass");
                break;
            case "F" :
                System.out.println(" you, have to really work hard");
                break;
        }
    }
}
