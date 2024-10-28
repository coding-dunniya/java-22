import java.util.function.BinaryOperator;

public class MethodReferences {

    public static void main(String[] args) {
        BinaryOperator<Integer> op = MethodReferences::multiply;
        System.out.println("multiply 10 * 15: " + op.apply(10, 15));

        // refer non static method
        MethodReferences mr = new MethodReferences();
        BinaryOperator<Integer> op1 = mr::instanceMultiply;
        System.out.println("multiply 10 * 17: " + op1.apply(10, 17));
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private int instanceMultiply(int a, int b) {
        return a * b;
    }
}
