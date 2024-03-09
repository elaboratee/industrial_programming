package task_2;

import task_2.accessories.Accessory;
import task_2.flowers.Flower;

public class Bouquet {
    private int price;
    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    private int calculatePrice() {
        int price = 0;

        for (Flower flower : flowers) {
            price += flower.getPrice();
        }

        for (Accessory accessory : accessories) {
            price += accessory.
        }
    }
}
