import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayLSample
{
    public static void main ( String[] args)
    {
        ArrayList<String> heros = new ArrayList<>();
        heros.add("Subhash K U");
        heros.add("elon musk");
        heros.add("gandhi");
        heros.add(1,"kalam");

        System.out.println(heros.get(0));
        System.out.println(heros.get(1));
        System.out.println(heros.get(2));
    }
}
