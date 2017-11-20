public class InsertionSort
{

    public static int[] insertionSort (int [ ] arr)
    {
        int  temp;
        for ( int i = 0; i < arr.length; i++)
        {
            for ( int j = i; j > 0; j--)
            {
                if (arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main ( String args[])
    {
        int [] myArray = {32, 43, 45, 64, 73,2,1,89,75,};
        int [] sorted = insertionSort(myArray);

        for ( int i= 0; i < sorted.length; i++)
        {
            System.out.print(sorted[i]);
            System.out.print(",");
        }
    }
}
