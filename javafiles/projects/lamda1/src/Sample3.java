import java.util.Arrays;
import java.util.List;

public class Sample3
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        numbers.forEach(integer -> System.out.println(integer));
//
//        numbers.forEach(System.out::println);
// method references
//         numbers.stream()
//                .map(e -> String.valueOf(e))
//                 .map(String::valueOf)
//                 .forEach(System.out::println);
//
//          numbers.stream()
//                 .map(e -> e.toString())
//                  .map(e -> String.valueOf(e))
//                  .map(String::toString)
//                  .forEach(System.out::println);

//
//        System.out.println(
//                numbers.stream()
//                    .reduce(0,(total , e) -> Integer.sum( total , e)));
//
//                    .reduce(0,Integer::sum));
//
        // give th values , double the even numbers and total

        int result = 0;

        for (int e: numbers)
        {
            if (e % 2 == 0 )
            {
                result += e * 2;

            }

        }
            // function composition or a pipeline
        System.out.println(
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum());


    }
}
