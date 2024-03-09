package task_2.accessories;

import java.util.Objects;

public final class Ribbon extends Accessory{
    private final int length;

    // constructors
    public Ribbon() {
        price = 80;
        color = "beige";
        material = "silk";
        length = 2;
    }

    public Ribbon(String color, int length) {
        this.color = color;
        material = "silk";
        this.length = length;
        price = length * 40;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ribbon ribbon)) return false;
        if (!super.equals(o)) return false;
        return length == ribbon.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }

    @Override
    public String toString() {
        return "Ribbon{" +
                "length=" + length +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
