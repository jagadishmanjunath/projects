public class GetterAndSetter
{
    public static void main (String[] args)
    {
      AnotherClass jaggu = new AnotherClass();

      jaggu.name= "jagadishmanjuanth";
        System.out.println(jaggu.name);

        jaggu.getAge( int 22 );

//        jaggu.accNum;
    }
}
class AnotherClass
{
    public String name;
    public int age;
//    public accNum;


//    getter
    public int getAge()
    {
        return age;
    }
//setter
    public void setAge(int age)
    {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}