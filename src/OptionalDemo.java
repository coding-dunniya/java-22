import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println("value is present");
        } else {
            System.out.println("value is absent");
        }

        Optional<String> nonEmptyOptional = Optional.of("ritesh");
        if (nonEmptyOptional.isPresent()) {
            String value = nonEmptyOptional.get();
            System.out.println(value);
        }
        optional.get(); // this will throw exception
    }
}
