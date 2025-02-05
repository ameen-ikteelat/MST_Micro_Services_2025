import java.util.function.Consumer;

public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> printLambda = message -> System.out.println(message);

        Consumer<String> printMethodRef = System.out::println;

        printLambda.accept("Hello using lambda!"); // Output: Hello using lambda!
        printMethodRef.accept("Hello using method reference!"); // Output: Hello using method reference!
    }
}
