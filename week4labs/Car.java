
public class Car {

    public static void main(String[] args) {

        Car newCar = new Car("Diesel", true, 4, 5, 4);

        System.out.println(newCar);

    }

    private String motorType;
    private boolean hasTrans;
    private int wheels, seats, doors;

    public Car(String motorType, boolean hasTrans, int wheels, int seats, int doors) {
        this.motorType = motorType;
        this.hasTrans = hasTrans;
        this.wheels = wheels;
        this.seats = seats;
        this.doors = doors;
    }

    public int getWheels() {

        return wheels;

    }

    public String getMotorType() {

        return motorType;

    }

    public boolean transmission() {
        return hasTrans;
    }

    @Override
    public String toString() {
        return "Car [motorType=" + motorType + ", hasTrans=" + hasTrans + ", wheels=" + wheels + ", seats=" + seats
                + ", doors=" + doors + "]";
    }

    

}