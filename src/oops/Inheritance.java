package oops;

public class Inheritance {

    public static void main(String[] args) {

        Car ec = new ElectricCar();
        ec.startEngine();

        Car pc = new PetrolCar();
        pc.startEngine();
    }
}

// Abstraction is achieved - the implementation of the behaviours in base class is abstracted and unknown
abstract class Car {
    abstract void startEngine();
}

class PetrolCar extends Car {

    private void checkFuel() {

    }

    public void startEngine() {
        checkFuel();
        // do other things
    }
}

class ElectricCar extends Car {

    private void checkBattery() {

    }

    public void startEngine() {
        checkBattery();
        // do other things
    }
}
