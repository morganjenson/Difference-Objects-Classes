// This is an example of a class in Java.
// A class is a template for the variables and methods of its objects.
public class Car {
    // These are instance variables.
    private final String type;
    private final String color;
    // This is a constructor.
    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }
    // This is a method.
    public void Description() {
        System.out.println("This car is a " + color + " " + type + ".");
    }
}