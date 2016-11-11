import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Юля on 08.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        eval(numbers, (n) -> true, "print all");
        eval(numbers, (n) -> false, "print none");
        eval(numbers, (n) -> n % 2 == 1, "print odd");
        eval(numbers, (n) -> n % 2 == 0, "print even");
        eval(numbers, (n) -> n > 5, "print > 4");
        int[] arr = {1, 2, 3, 4, 5, 6};

    }

    private static void eval(List<Integer> numbers, Predicate<Integer> predicate, String str) {
        System.out.print(str + ": ");
        for (Integer n : numbers) {
            if (predicate.test(n)) {
                System.out.print(n + ", ");
            }
        }
        System.out.println();
    }
}
