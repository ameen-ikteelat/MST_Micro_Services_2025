public class PrototypeDemo {
    public static void main(String[] args) {
        // Create original objects
        ConcretePrototype1 prototype1 = new ConcretePrototype1("Prototype 1 Data");
        ConcretePrototype2 prototype2 = new ConcretePrototype2(42);

        // Clone objects
        ConcretePrototype1 clone1 = (ConcretePrototype1) prototype1.clone();
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();

        // Display original and cloned objects
        System.out.println("Original: " + prototype1);
        System.out.println("Clone: " + clone1);

        System.out.println("Original: " + prototype2);
        System.out.println("Clone: " + clone2);
    }
}
