public class Methods
{
//    public - visible to everyone
//    private - visible only to class
//    protected  - visible to the packages and to its subclasses
   public static int min ( int num1 , int num2)
   {
       int minimum;

       if (num1 < num2)
       {
           minimum =num1;
       }
        else
       {
           minimum = num2;
       }

       System.out.println(minimum);
            return minimum;
   }


    public static void main ( String [] args)
    {
        min(8,9);
    }

}
