import java.util.function.Function;

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        // Using a lambda expression
        Function<Integer, Double> squareRootLambda = x -> Math.sqrt(x);

        // Using a method reference
        Function<Integer, Double> squareRootMethodRef = Math::sqrt;

        System.out.println(squareRootLambda.apply(16)); // Output: 4.0
        System.out.println(squareRootMethodRef.apply(16)); // Output: 4.0
    }
}
