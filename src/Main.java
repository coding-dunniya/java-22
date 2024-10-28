import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

// main class - contains main method
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) {
        Function<Integer, Boolean> ec = n -> n % 2 == 0;

        System.out.println("10 is even: " + ec.apply(10));
        System.out.println("15 is even: " + ec.apply(15));

        List<String> list = Arrays.asList("ritesh", "india", "america");

        Consumer<String> consumer = s -> System.out.println(s);

        list.stream().forEach(consumer);
    }
}

//interface EvenCheck {
//
//    // check if n is even
//    boolean isEven(int n);
//}