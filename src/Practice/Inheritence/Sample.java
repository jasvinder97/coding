package Practice.Inheritence;

public class Sample {
    public static void main(String[] args) {
//        Car car = new Car();
//        Maruti maruti = new Maruti();
        Car m = new Maruti();
    }
}

class Car {
    public Car() {
        System.out.println("Car");
    }
}

class Maruti extends Car {
    public Maruti() {
        System.out.println("Maruti");
    }
}
