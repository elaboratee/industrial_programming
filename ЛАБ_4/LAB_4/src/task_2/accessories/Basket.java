package task_2.accessories;

import java.util.Objects;

public final class Basket extends Accessory {
    private final String size;

    // constructors
    public Basket() {
        price = 900;
        color = "brown";
        material = "jute";
        size = "medium";
    }

    public Basket(String size) {
        price = 900;
        color = "brown";
        material = "jute";
        this.size = size;
    }

    // getters
    public String getSize() {
        return size;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket basket)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(size, basket.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
