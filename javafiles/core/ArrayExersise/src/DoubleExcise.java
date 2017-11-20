public class DoubleExcise
{
    public static void main ( String [] args)
    {
//        declare a values in double
        double sayArray[] = {5.5, 6.5, 76.5, 7689.8889, 873598.76, 1.00009};

//        print those array

        for ( int i = 0 ; i < sayArray.length; i++)
        {
            System.out.println(sayArray[i]);
        }

//        find the largest of the numbers


        double largest;
        largest = sayArray[0];
        for ( int i = 1 ; i < sayArray.length; i++)
        {
            if ( largest < sayArray[i])
            {
                largest = sayArray[i];
            }
        }
        System.out.println( " the largest number is"+ largest);
//        sum all the double values
        double sum =0;
        for (int i = 0; i < sayArray.length; i++)
        {
            sum += sayArray[i];
        }
        System.out.println(sum);
    }
}
