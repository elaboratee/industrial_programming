package task_1;

import task_1.enums.BodyTypes;

import java.util.Arrays;
import java.util.Objects;

class Car {
    private final String brand;
    private String color;
    private final BodyTypes bodytype;
    private int fuelTankVolume;
    private double fuelValue;
    private int seatsAmount;
    private int mass;
    private Engine engine;
    private Wheel[] wheels;

    // constructors
    public Car(String brand, BodyTypes bodytype) {
        this.brand = brand;
        this.bodytype = bodytype;
    }

    public Car(String brand, String color, BodyTypes bodytype) {
        this.brand = brand;
        this.color = color;
        this.bodytype = bodytype;
    }

    public Car(String brand, BodyTypes bodytype, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.bodytype = bodytype;
        this.engine = engine;
        this.wheels = wheels;
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isBlank()) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Blank string in color field");
        }
    }

    public BodyTypes getBodytype() {
        return bodytype;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        if (fuelTankVolume > 0) {
            this.fuelTankVolume = fuelTankVolume;
        } else {
            throw new IllegalArgumentException("Fuel tank volume should be above zero");
        }
    }

    public double getFuelValue() {
        return fuelValue;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        if (seatsAmount > 0) {
            this.seatsAmount = seatsAmount;
        } else {
            throw new IllegalArgumentException("Seats amount should be above zero");
        }
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        if (mass > 0) {
            this.mass = mass;
        } else {
            throw new IllegalArgumentException("Car mass should be above zero");
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    // methods

    /**
     * Method that implements movement process
     * It's converting distance into fuel and reduces it, if it's possible
     * @param travelDistance - how far you want to go in kilometers
     * @exception IllegalArgumentException - throws is not enough fuel
     */
    public void drive(int travelDistance) {
        double requiredFuel = travelDistance * (engine.getFuelConsumption() / 100);
        if (fuelValue - requiredFuel >= 0) {
            fuelValue -= requiredFuel;
        } else {
            throw new IllegalArgumentException("Not enough fuel for such a long distance (" + travelDistance + "km)");
        }
    }

    /**
     * Method sum up available fuel and received fuel
     * If sum is higher than maximum amount set maximum
     * @param fuelToFill - amount of received fuel
     */
    public void fillFuel(double fuelToFill) {
        if (fuelValue + fuelToFill >= fuelTankVolume) {
            fuelValue = fuelTankVolume;
        } else {
            fuelValue += fuelToFill;
        }
    }

    /**
     * Changes current wheel with a new one
     * @param wheelIndex - index of changing wheel
     * @param newWheel - object wheel
     */
    public void changeWheel(int wheelIndex, Wheel newWheel) {
        wheels[wheelIndex] = newWheel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return getFuelTankVolume() == car.getFuelTankVolume() &&
                Double.compare(getFuelValue(), car.getFuelValue()) == 0 &&
                getSeatsAmount() == car.getSeatsAmount() &&
                getMass() == car.getMass() &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getBodytype(), car.getBodytype()) &&
                Objects.equals(getEngine(), car.getEngine()) &&
                Arrays.equals(getWheels(), car.getWheels());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getBrand(), getColor(), getBodytype(), getFuelTankVolume(), getFuelValue(), getSeatsAmount(), getMass(), getEngine());
        result = 31 * result + Arrays.hashCode(getWheels());
        return result;
    }

    @Override
    public String toString() {
        return "Car {" +
                "\n\tbrand='" + brand + '\'' +
                ", \n\tcolor='" + color + '\'' +
                ", \n\tbodytype='" + bodytype + '\'' +
                ", \n\tfuelTankVolume=" + fuelTankVolume +
                ", \n\tfuelValue=" + fuelValue +
                ", \n\tseatsAmount=" + seatsAmount +
                ", \n\tmass=" + mass +
                ", \n\tengine=" + engine +
                ", \n\twheels=" + wheels[0].toString() +
                "\n}";
    }
}
