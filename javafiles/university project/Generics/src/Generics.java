import java.util.ArrayList;

public class Generics
{
    public static void main (String [] args)
    {
        ArrayList <Integer> arrayList = new ArrayList<>();


        arrayList.add(23);
        arrayList.add(34);
        arrayList.add(53);
        arrayList.add(57);


        for (Object i:arrayList)
        {
            System.out.println(i);
        }


    }











}
