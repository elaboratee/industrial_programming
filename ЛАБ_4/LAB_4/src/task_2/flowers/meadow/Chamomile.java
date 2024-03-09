package task_2.flowers.meadow;

public final class Chamomile extends MeadowFlower {
    public Chamomile() {
        super();
        color = "white";
        freshness = 0;
        stemLength = 15;
        price = 200;
    }

    public Chamomile(int freshness) {
        super();
        color = "white";
        this.freshness = freshness;
        stemLength = 15;
        price = 200;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
