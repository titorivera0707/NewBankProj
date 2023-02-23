
public class Model3 extends Car{

    private boolean regenBrake;
    private int kwCapacity, kwOutput;

    public Model3(String motorType, boolean hasTrans, int wheels, int seats, int doors) {
        super("Electric", false, wheels, seats, doors);
    }

    public int getBatterySize(){
        return kwCapacity;
    }

    public int getEMotorOutput() {
        return kwOutput;
    }

    public boolean hasRegenBraking() {
        return regenBrake;
    }

}