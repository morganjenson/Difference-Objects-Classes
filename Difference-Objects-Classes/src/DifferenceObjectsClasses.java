// This is the main class used to make objects of the Car class and call methods.
public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // This is an object of the Person class.
        // An object is a single instance of a class.
        Car car1 = new Car("sedan", "red");
        car1.Description();  // Output: This car is a red sedan.
        // Another object of the Person class.
        Car car2 = new Car("SUV", "blue");
        car2.Description();  // Output: This car is a blue SUV.
    }
}