public class lamda1 {
    public static void main(String[] args){
        Thread th = new Thread(() ->
                System.out.println("In anohter thread"));
                th.start();

                System.out.println("I'm in main");
    }
}
