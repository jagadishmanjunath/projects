public class Sample2 {
    public static void main(String[] args){

        Thread th;
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));
        th = new Thread(() -> System.out.println("I'n another thread"));

        th.start();

        System.out.println("I'm in main");
//
//              so what do this lamda expression helps in the betterment of the code it
//              eliminates the  anonoymus innerclasses through inovoke dyanamminc effectively under the hoods
//              makes the language light weigth





    }

}
