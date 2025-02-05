import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        // Using a lambda expression
        names.forEach(name -> System.out.println(name.toUpperCase()));

        // Using a method reference
        names.forEach(String::toUpperCase);
    }
}
