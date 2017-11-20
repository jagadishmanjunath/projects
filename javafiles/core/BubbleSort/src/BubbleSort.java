import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input ={9,8,7,6,5,4,3,2,1};
        BubbleSorte(input);
    }

    public static void BubbleSorte(int array[]) {
        int n = array.length;
        int k;

        for (int m = n; m >= 0; m--)
        {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > k) {
                    swapMe(i, k, array);
                }
            }
            printNum(array);
        }
    }

    public static void  swapMe (int i, int j, int[] array)
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void printNum (int[] input)
    {
        for ( int i = 0 ; i < input.length; i++)
        {
            System.out.print(input[i]+",");
        }
        System.out.println("\n");
    }
}
