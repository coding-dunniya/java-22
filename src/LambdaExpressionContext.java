import java.util.function.Function;

public class LambdaExpressionContext {

    public static void main(String[] args) {
        Function<Integer, Boolean> lambda = getLambda();
        runLambda(lambda);
    }

    private static Function<Integer, Boolean> getLambda() {
        return n -> n % 2 == 0;
    }

    private static void runLambda(Function<Integer, Boolean> lambda) {
        System.out.println("10 is even: " + lambda.apply(10));
        System.out.println("15 is even: " + lambda.apply(15));
        System.out.println("17 is even: " + lambda.apply(17));
    }
}
