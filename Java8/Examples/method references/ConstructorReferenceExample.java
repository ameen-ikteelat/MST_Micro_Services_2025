import java.util.function.Supplier;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // Using a lambda expression
        Supplier<StringBuilder> stringBuilderSupplierLambda = () -> new StringBuilder();

        // Using a method reference
        Supplier<StringBuilder> stringBuilderSupplierMethodRef = StringBuilder::new;

        System.out.println(stringBuilderSupplierLambda.get().append("Lambda created!")); // Output: Lambda created!
        System.out.println(stringBuilderSupplierMethodRef.get().append("Method reference created!")); // Output: Method reference created!
    }
}
