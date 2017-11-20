import java.util.ArrayList;

public class ArrayListAdvanced
{
    public static void  main (String [] args )
    {
        ArrayList<String> myArrayList =  new ArrayList<>();


        ArrayList<Integer> myNewInteger = new ArrayList<>();

//        set value
        for (int i = 0 ; i < 20 ; i++)
        {
            myNewInteger.add(Integer.valueOf(i));//Autoboxing
        }

//        get value

        for (int i = 0 ; i < 20 ; i++)
        {
            System.out.println("value is " + myNewInteger.get(i).intValue()); //Unboxing
        }
    }
}
