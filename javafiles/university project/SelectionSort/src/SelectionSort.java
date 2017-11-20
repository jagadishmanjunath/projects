public class SelectionSort
{
    public static int [] Selection (int [] arr )
    {
        for (int i = 0; i < arr.length; i++)
        {
            int index = i;
            for ( int j = i ; j < arr.length; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
    public static void main ( String[] args)
    {
        int [] myArray = {10, 20, 85, 55, 738, 2, 1,8555,};

        int [] sortedArray = Selection(myArray);


        for ( int i = 0 ; i < sortedArray.length; i++)
        {
            System.out.println(sortedArray[i]);
            System.out.println(",");
        }
    }
}
