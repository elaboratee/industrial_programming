package task_1;

import java.util.Objects;

class Engine {
    private double volume;
    private int power;
    private double fuelConsumption;

    // constructors
    public Engine() {}

    public Engine(double volume, int power, double fuelConsumption) {
        this.volume = volume;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    // getters and setters
    public double getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Engine volume should be positive and not zero");
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(short power) {
        if (power > 0) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("Engine power should be positive and not zero");
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(short fuelConsumption) {
        if (fuelConsumption > 0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            throw new IllegalArgumentException("Fuel consumption should be positive and not zero");
        }
    }

    // methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Engine engine = (Engine) object;
        return Double.compare(getVolume(), engine.getVolume()) == 0 &&
                getPower() == engine.getPower() &&
                getFuelConsumption() == engine.getFuelConsumption();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getPower(), getFuelConsumption());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
