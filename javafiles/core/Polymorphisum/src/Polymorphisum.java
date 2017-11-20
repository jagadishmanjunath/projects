public class Polymorphisum
{
    public static void main (String [] args)
    {
        for (int i = 0; i < 5; i++)
        {
            Banker banker = GenerateObjects();
            System.out.println("Bank greet" + banker.toGreet());
        }
    }
        public static Banker GenerateObjects()
        {
            int random = (int)(Math.random()*3) + 1;

            switch (random)
            {
                case 1:
                    return new BOB("greetings from the Bob");
//                    break;
                case 2 :
                    return new YesBank("greetings from the YesBank");
//                    break;
            }

            return null;
        }

}

class Banker
{
    public  String name;

    public String toGreet()
    {
        return "default : greetings";
    }

    public Banker(String name) {
        this.name = name;
    }
}



class BOB extends Banker
{
    public BOB(String name) {
        super(name);
    }

    @Override
    public String toGreet() {
        super.toGreet();
        return "its bob greetings";
    }
}

class YesBank extends Banker
{
    public YesBank(String name) {
        super(name);
    }

    @Override
    public String toGreet() {
        super.toGreet();
        return " its yes bank greetings";
    }
}


