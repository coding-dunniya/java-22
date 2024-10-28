import java.util.function.Consumer;

public class VariableCapture {

    private String abc = "hello world";

    private static String xyz = "india";

    public static void main(String[] args) {
        Consumer<String> consumer = s -> {
            System.out.println(xyz);
            xyz = "europe";
            test();
        };
    }

    private void lambda() {
        String variable = "hello world";
        Consumer<String> consumer = s -> {
            System.out.println(abc);
            abc = "india";
            instanceMethod();
            test();
            // access variable
            System.out.println(variable);
        };
    }

    private static void test() {

    }

    private void instanceMethod() {

    }
}
