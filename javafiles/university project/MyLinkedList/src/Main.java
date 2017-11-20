import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main
{
 public static void main (String [] args)
{
//     Banker jaggu = new Banker("JagadishaManjunath", 957982);
//     Banker subbu = new Banker("Subhash K U", 89348888);
//      jaggu = subbu;
//
//     subbu.setCbalance(42879.4);
//
//     System.out.println(subbu.getCbalance());


    ArrayList<Integer> myIntList = new ArrayList<>();
    myIntList.add(5);
    myIntList.add(7);
    myIntList.add(8);
    myIntList.add(9);


    for (int i = 0; i < myIntList.size(); i++)
    {
        System.out.println(i + "-----"+ myIntList.get(i));
    }

    myIntList.add(1,6);
    {
        System.out.println("-----------------------");
    }


    for ( int i = 0 ; i < myIntList.size(); i++)
    {
        System.out.println(i + "-------" + myIntList.get(i));
    }

//linked list


    LinkedList<String> programming = new LinkedList<>();

    programming.add("c");
    programming.add("java");
    programming.add("Python");

//    iterator
    pllist(programming);

    programming.add(1,"SWIFT");

    public static void pllist( LinkedList<String> ll)
    {
    Iterator<String> i = ll.iterator();
    while (i.hasNext())
    {
        System.out.println("Your language is:"+i.next());
    }

    }

}
