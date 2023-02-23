
public class F350 extends Car{

    private String gasType;
    private int loadCapacity;
    private boolean workTruck;

    public F350(String motorType, boolean hasTrans, int wheels, int seats, int doors) {
        super(motorType, true, wheels, seats, doors);
    }

    public String getGasType() {
        return gasType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isWorkTruck() {
        return workTruck;
    }

}