package task_2;

import task_2.accessories.Accessory;
import task_2.flowers.Flower;
import task_2.flowers.dried.Gypsophila;

import java.util.Arrays;

public class TaskMain {
    public static void main(String[] args) {
        Gypsophila f = new Gypsophila("white", true);
        System.out.println(f.getColor());
    }
}
