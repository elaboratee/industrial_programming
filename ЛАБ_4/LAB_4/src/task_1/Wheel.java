package task_1;

import task_1.enums.Seasonalities;
import java.util.Objects;

class Wheel {
    // Fields
    private String manufacturer;
    private String seasonality;
    private int width;
    private int profile;
    private int radius;
    private boolean spikes;

    // Constructors
    public Wheel() {}

    public Wheel(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Wheel(int width, int profile, int radius) {
        this.width = width;
        this.profile = profile;
        this.radius = radius;
    }

    // Getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (!manufacturer.isBlank()) {
            this.manufacturer = manufacturer;
        } else {
            throw new IllegalArgumentException("Blank string in manufacturer field");
        }
    }

    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        boolean isEnumValue = false;
        for (Seasonalities seasonEnum : Seasonalities.values()) {
            if (seasonEnum.toString().equals(seasonality.toUpperCase())) {
                isEnumValue = true;
                break;
            }
        }
        if (isEnumValue) {
            this.seasonality = seasonality;
        } else {
            throw new IllegalArgumentException("Invalid seasonality value." +
                    "Value should be: summer, winter or multiseasonal");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(short width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Invalid width value");
        }
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(byte profile) {
        if (profile > 0) {
            this.profile = profile;
        } else {
            throw new IllegalArgumentException("Invalid profile value");
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(byte radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Invalid diameter value");
        }
    }

    public boolean hasSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }

    // Methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Wheel wheel = (Wheel) object;
        return width == wheel.width && profile == wheel.profile &&
                radius == wheel.radius && spikes == wheel.spikes &&
                Objects.equals(manufacturer, wheel.manufacturer) &&
                Objects.equals(seasonality, wheel.seasonality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, seasonality, width, profile, radius, spikes);
    }

    @Override
    public String toString() {
        return "Wheel {" +
                "manufacturer='" + manufacturer + '\'' +
                ", seasonality='" + seasonality + '\'' +
                ", width=" + width +
                ", profile=" + profile +
                ", diameter=" + radius +
                ", spikes=" + spikes +
                "}";
    }
}
