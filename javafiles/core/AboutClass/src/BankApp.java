public class BankApp
{

    String name;
    int age;
    String taxDetail;
    double amount;

   //constructor

   public BankApp(String name)
   {
       this.name = name;
   }
//    ask user for age

    public void accAge (int age)
    {
        this.age = age;
    }

//    tax detail

    public void accTax (String taxDetail)
    {
        this.taxDetail = taxDetail;
    }

//    taking the deposited amount

    public void depAmount ( double amount)
    {
        this.amount = amount;
    }

//    taking user info

    public void getUserInfo()
    {
        System.out.println("Name of the user is :" + this.name);
        System.out.println("The balance is  :" + this.amount);
    }









}

