public class ArrayExersise
{
    public static void main ( String [] args)
    {
//        declare an array
    int [] sayArray = { 1, 5, 6, 76, 89, 74,64,33,77};
//     print those values that are stored in an array

        for (int i = 0 ; i < sayArray.length; i++)
        {
            System.out.println(sayArray[i]);
        }

//    find the largest number in a declared array
        int largest = sayArray[0];
        for (int i = 1; i < sayArray.length; i++)
        {
            if ( sayArray[i] > largest)
            {
                largest = sayArray[i];
            }
        }
        System.out.println("the largest value is :" + largest);
//        add all of those values in an array

        int sum = 0;

        for ( int i =0 ; i < sayArray.length; i++)
        {
            sum += sayArray[i];
        }
        System.out.println(" the total sum of :" + sum);





    }
}
