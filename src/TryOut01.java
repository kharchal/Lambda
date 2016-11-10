/**
 * Created by Юля on 10.11.2016.
 */
public class TryOut01 {
    public static void main(String[] args) {
        Lamda lamda = n -> n + 1;
        int n = lamda.process(5);
        System.out.println(n);
//
    }

}

interface Lamda {
    int process(int n);
}