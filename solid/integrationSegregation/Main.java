package solid.integrationSegregation;

interface RiderInterface {
    void bookRide();
    void payRide();
}

interface DriverInterface {
    void acceptRide();
    void drive();
    void endDrive();
}

class Rider implements RiderInterface {

    @Override
    public void bookRide() {

    }

    @Override
    public void payRide() {

    }
}

class Driver implements DriverInterface {

    @Override
    public void acceptRide() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void endDrive() {

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
