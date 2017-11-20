public class BankUser
{
    public static void main (String args[])
    {
        BankApp Jaggu = new BankApp( "JagadishManjunath");

        Jaggu.accAge(23);
        Jaggu.depAmount(100000);

        Jaggu.getUserInfo();

        BankApp subbu = new BankApp("Subhash.K.U");

        subbu.accAge(31);
        subbu.depAmount(1000000);
        subbu.getUserInfo();

        //Inheritance starts here

        SBIUser jaggi = new SBIUser("jagadishmanjunatha");
        jaggi.accTax("My text info");
        jaggi.depAmount(43778);

        jaggi.getUserInfo();
    }
}





