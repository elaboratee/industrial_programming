package task_2.accessories;

import java.util.Objects;

public final class WrappingPaper extends Accessory {
    private final int width;
    private final int length;

    // constructors
    public WrappingPaper() {
        price = 700;
        color = "sky blue";
        material = "сoated paper";
        width = 100;
        length = 70;
    }

    public WrappingPaper(String color, int width, int length) {
        price = width * length / 10;
        this.color = color;
        material = "сoated paper";
        this.width = width;
        this.length = length;
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrappingPaper that)) return false;
        if (!super.equals(o)) return false;
        return width == that.width && length == that.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, length);
    }

    @Override
    public String toString() {
        return "WrappingPaper{" +
                "width=" + width +
                ", length=" + length +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
