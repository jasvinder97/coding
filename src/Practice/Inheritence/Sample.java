package Practice.Inheritence;

public class Sample {
    public static void main(String[] args) {
        Car car = new Car();
//        Maruti maruti = new Maruti();
        Car m = new Maruti();
//        m.startCar();
//        car.startCar();
        car.startCar();
        m.startCar();
        Maruti maruti = new Maruti();
        maruti.startCar();
    }
}

class Car {
    public Car() {
        System.out.println("Car");
    }

    static void carStatic() {
        System.out.println("Static method of car");
    }

    final void carFinal() {
        System.out.println("Final method of Car");
    }

    public void startCar() {
        System.out.println("Start car");
    }
}

class Maruti extends Car {

    public Maruti() {
        System.out.println("Maruti");
    }

    static void carStatic() {
        System.out.println("Static method of maruti");
    }

    @Override
    public void startCar() {
        System.out.println("Start maruti");
    }
}
