public class BubbleSortr
{
    public static void printNum(int [] input)
    {
        for (int i = 0 ; i < input.length; i++)
        {
            System.out.print(input[i] + ",");
        }
        System.out.println("\n");
    }

    public static void swapme ( int i , int j , int[] array)
    {
        int temp;

        temp = array[i];
        array[i] = array [j];
        array[j]= temp;

    }

    public static void bubbleSort ( int array [])
    {
        int n = array.length;
        int k;

        for (int m = n ; m >= 0 ; m--)
        {
            for (int i =0; i < n -1 ; i++)
            {
                k = i + 1;
                if ( array[i] > array[k])
                {
                    swapme(i , k,array);
                }
                 printNum(array);
            }
        }
    }

    public static void main (String [] args)
    {
        int [] input = {4 , 55, 73, 92, 78, 98, 1};
        bubbleSort(input);
    }
}
