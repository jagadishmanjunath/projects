public class Banker
{
    private String name;
    private double cbalance;

    public Banker(String name, double cbalance)
    {
        this.name = name;
        this.cbalance = cbalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCbalance() {
        return cbalance;
    }

    public void setCbalance(double cbalance) {
        this.cbalance = cbalance;
    }
}
