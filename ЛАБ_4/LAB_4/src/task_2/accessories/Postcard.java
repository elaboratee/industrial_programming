package task_2.accessories;

import java.util.Objects;

public final class Postcard extends Accessory{
    private final String content;

    // constructors
    public Postcard() {
        price = 150;
        color = "tan";
        material = "paper";
        content = """
                The best flowers for the best person.
                From the bottom of my heart.""";
    }

    public Postcard(String message) {
        price = 150;
        color = "tan";
        material = "paper";
        content = message;
    }

    // getters
    public String getContent() {
        return content;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Postcard postcard)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(content, postcard.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }

    @Override
    public String toString() {
        return "Postcard{" +
                "content='" + content + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
