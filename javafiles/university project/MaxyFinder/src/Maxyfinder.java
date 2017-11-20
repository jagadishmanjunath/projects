import javax.xml.ws.Holder;

public class Maxyfinder {
    public static <T extends Comparable<T>> T maxy(T a, T b, T c) {
        T maxy = a;

        if (b.compareTo(maxy) > 0) {
            maxy = b;
        }
        if (c.compareTo(maxy) > 0) {
            maxy = c;
        }
        return maxy;
    }

    public static void main(String[] args) {
        System.out.printf("Max of %d ,%d, %d is:%d", 2, 4, 3, maxy(2, 4, 3));

        Holder<String> stringValue = new Holder<>();
        stringValue.setMyVar(new String("\n Helllo world"));
        System.out.println(stringValue.getMyVar());

    }
}