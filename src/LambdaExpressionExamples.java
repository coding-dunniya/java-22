import java.util.function.*;

public class LambdaExpressionExamples {

    public static void main(String[] args) {
        // 1. return a double random value

        DoubleSupplier rv = () -> Math.random() * 100;
        System.out.println("one random value: " + rv.getAsDouble());
        System.out.println("another random value: " + rv.getAsDouble());

        // 2. multiply two integer numbers
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("multiply 10 * 10: " + multiply.apply(10, 10));
        System.out.println("multiply 10 * 15: " + multiply.apply(10, 15));

        // 3. reverse a string
        UnaryOperator<String> stringOps = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println("reverse of hello world: " + stringOps.apply("hello world"));
        System.out.println("reverse of ritesh: " + stringOps.apply("ritesh"));

        // 4. factorial of a integer number
        UnaryOperator<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println("factorial of 5: " + factorial.apply(5));
        System.out.println("factorial of 3: " + factorial.apply(3));
        System.out.println("factorial of 7: " + factorial.apply(7));
    }
}