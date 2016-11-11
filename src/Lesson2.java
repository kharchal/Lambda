import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lesson2 {
    public static void main(String[] args) {

        AAA aaa = n -> n < 7;

        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer integer : array) {
            System.out.println(aaa.test(integer));
        }
        AAA aaa2 = n -> {
            if (n > 5) {
                return true;
            } else {
                return false;
            }
        };
        array.stream().filter(aaa2).forEach(System.out::println);
        int[] a ={1,2,3};
//        Arrays.stream(a).
        String s = "fkwbfkj";
        BBB bbb = String::length;
        System.out.println(s + " " + bbb.size(s));
        CharAt charAt = String::charAt;
        System.out.println(charAt.charAt(s, 3));
        charAt = (str, c) ->(str.charAt(c) == 'b') ? 'B':'X';
        System.out.println(charAt.charAt(s, 3));
        System.out.println(charAt.charAt(s, 2));

        Arr<Integer> arrInt = n -> {
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Math.random() * 100);
            }
            return arr;
        };
        System.out.println(Arrays.toString(arrInt.init(5)));

        Action[] actions = {n -> n * 2, n -> n + 1, n -> n - 10};
        for (Action action : actions) {
            System.out.println(action.act(3));
        }
    }
}
interface Action {
    int act(int val);
}

interface Arr<T> {
    T[] init(int n);
}
interface CharAt {
    char charAt(String s, int n);
}

interface BBB {
    int size(String s);
}

interface AAA extends Predicate<Integer> {
//    boolean go(int x);

    @Override
    boolean test(Integer integer);
}
