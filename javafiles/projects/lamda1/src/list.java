import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class list {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // external Iterrators
//        for (int i = 0 ; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i));
//
//        }
//         for (int e: numbers) {
//            System.out.print(e);
//         }


//              internal Iterator
//        which is an anonyumus inner class with lot of noise where we can replace this
//        code with the lamda expression as below
//            numbers.forEach(new Consumer<Integer>() {
//                @Override
//                public void accept(Integer integer) {
//                    System.out.println(integer);
//                }
//            });


//            numbers.forEach((integer) -> System.out.println(integer));

//        paraenthisis is optional , but only for one parameter lambdas

                 numbers.forEach(integer -> System.out.println(integer));

            // java 8 has type inference, finally but only for lambda expression
                numbers.forEach(System.out::println);
             // while lambdas are really cute keep them that way do write more than a single line

            // avoid curley braces in the lambdas it's an antipattern which we have to avoid

    }
}
