package task_2;

import task_2.accessories.Accessory;
import task_2.flowers.Flower;

import java.util.*;

public class Bouquet {
    private int price;
    private ArrayList<Flower> flowers;
    private ArrayList<Accessory> accessories;

    // constructors
    public Bouquet() {}

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
        this.price = calculateFullPrice(flowers, accessories);
    }

    // getters and setters
    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
        this.price += calculateFlowerPrice(flowers);
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setAccessories(ArrayList<Accessory> accessories) {
        this.accessories = accessories;
        this.price += calculateAccessoryPrice(accessories);
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public int getPrice() {
        return price;
    }

    // methods

    /**
     * Methods sums all prices of included parts
     * @param flowers - flowers included
     * @param accessories - accessories included
     * @return integer of full price of bouquet
     */
    private static int calculateFullPrice(ArrayList<Flower> flowers,
                                          ArrayList<Accessory> accessories) {
        int price = 0;

        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }

        return price;
    }

    /**
     * Methods sums all prices of included flowers
     * @param flowers - flowers included
     * @return integer of full price of flowers
     */
    private static int calculateFlowerPrice(ArrayList<Flower> flowers) {
        int price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    /**
     * Methods sums all prices of included accessories
     * @param accessories - accessories included
     * @return integer of full price of accessories
     */
    private static int calculateAccessoryPrice(ArrayList<Accessory> accessories) {
        int price = 0;
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }
        return price;
    }

    /**
     * Methods sorts array of flowers in bouquet by freshness of each flower
     */
    public void sortFlowersByFreshness() {
        int n = flowers.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (flowers.get(j).getFreshness() > flowers.get(j + 1).getFreshness()) {
                    // Обмен местами
                    Flower temp = flowers.get(j);
                    flowers.set(j, flowers.get(j + 1));
                    flowers.set(j + 1, temp);
                    swapped = true;
                }
            }

            // Если внутренний цикл не произвел обмен, значит массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Bouquet bouquet)) return false;
        return price == bouquet.price &&
                Objects.equals(flowers, bouquet.flowers) &&
                Objects.equals(accessories, bouquet.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, flowers, accessories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Bouquet (art. ");
        sb.append(Integer.toString(this.hashCode()).substring(1));
        sb.append(", price ").append(this.price).append("₽):\n");

        // Создаем Map для хранения количества каждого вида цветов
        Map<Flower, Integer> flowerCounts = new HashMap<>();
        for (Flower flower : flowers) {
            flowerCounts.put(flower, flowerCounts.getOrDefault(flower, 0) + 1);
        }

        // Выводим информацию о цветах и их количестве
        for (Map.Entry<Flower, Integer> entry : flowerCounts.entrySet()) {
            sb.append(entry.getKey().getName()).append(" - ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }

}
