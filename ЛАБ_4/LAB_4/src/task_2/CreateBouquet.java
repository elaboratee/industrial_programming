package task_2;

import task_2.accessories.*;
import task_2.flowers.Flower;
import task_2.flowers.bulbous.Tulip;
import task_2.flowers.bush.Rose;
import task_2.flowers.dried.Echinops;

import java.util.ArrayList;

public class CreateBouquet {
    /**
     * Method fill up a received bouquet with flowers and accessories
     * @param bouquet - empty object bouquet
     */
    public static void createBouquete(Bouquet bouquet) {
        ArrayList<Flower> flowers = new ArrayList<>();
        ArrayList<Accessory> accessories = new ArrayList<>();

        flowers.add(new Rose("black", false, 1));
        flowers.add(new Rose("black", false, 1));
        flowers.add(new Rose("black", false, 1));
        flowers.add(new Tulip("white", "regular", 2));
        flowers.add(new Tulip("white", "regular", 2));
        flowers.add(new Echinops(true, false));
        flowers.add(new Echinops(true, false));

        accessories.add(new Basket());
        accessories.add(new Postcard());
        accessories.add(new Ribbon("white", 50));
        accessories.add(new WrappingPaper());

        bouquet.setFlowers(flowers);
        bouquet.setAccessories(accessories);
    }
}
