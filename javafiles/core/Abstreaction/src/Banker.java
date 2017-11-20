import com.sun.org.apache.xpath.internal.SourceTree;

public  abstract class Banker
{
    private String name;
    private String tax;
    private double balanace;

    public Banker(String name, String tax, double balanace) {
        this.name = name;
        this.tax = tax;
        this.balanace = balanace;
    }

    public void greets()
    {
        System.out.println("thanking you Mr."+this.name+ "for using our service");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public double getBalanace() {
        return balanace;
    }

    public void setBalanace(double balanace) {
        this.balanace = balanace;
    }
}
