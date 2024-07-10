package Practice.Inheritence;

public class Vehicle {

    public String color = "New Color";

    public static void main(String[] args) {
        Vehicle v = new MotorCar();
        v.display();
        System.out.println(v.color);
        MotorCar car = new MotorCar();
        System.out.println(car.color);
    }

    public void display() {
        System.out.println("Display Veheicle");
    }
}

class MotorCar extends Vehicle {
    public String color = "Red";

    public void display() {
        System.out.println("Display MotorCar");
    }
}
