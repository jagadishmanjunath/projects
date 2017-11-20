public class SBIUser extends BankApp
{
   public SBIUser(String name)
   {
       super(name);
   }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("the tax info is :" + taxDetail);
    }
}
