// Engine class
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start() {
        System.out.println("Engine of type " + type + " is starting...");
    }
}

// Wheel class
public class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void rotate() {
        System.out.println("Wheel of size " + size + " is rotating...");
    }
}

// Car class using composition
public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Car(Engine engine, Wheel[] wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void startCar() {
        engine.start();
        for (Wheel wheel : wheels) {
            wheel.rotate();
        }
        System.out.println("Car is moving...");
    }

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Wheel[] wheels = {
            new Wheel(18),
            new Wheel(18),
            new Wheel(18),
            new Wheel(18)
        };

        Car car = new Car(engine, wheels);
        car.startCar();
    }
}