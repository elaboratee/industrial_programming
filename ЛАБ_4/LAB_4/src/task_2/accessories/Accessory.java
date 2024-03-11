package task_2.accessories;

import java.util.Objects;

public abstract class Accessory {
    protected int price;
    protected String color;
    protected String material;

    // getters
    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accessory accessory)) return false;
        return price == accessory.price &&
                Objects.equals(color, accessory.color) &&
                Objects.equals(material, accessory.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, material);
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}