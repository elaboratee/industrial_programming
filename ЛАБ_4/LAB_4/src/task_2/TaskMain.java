package task_2;

import task_2.accessories.Accessory;
import task_2.accessories.WrappingPaper;
import task_2.enums.MenuBar;
import task_2.flowers.Flower;
import task_2.flowers.bush.Rose;
import task_2.flowers.dried.Echinops;
import task_2.flowers.dried.Gypsophila;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        CreateBouquet.createBouquete(bouquet);
        System.out.println(bouquet);

        System.out.println("""
                ====== Menu ======
                1. Sort flowers by freshness
                2. Find a flower that matches a range of stem lengths
                
                Choose the required action:\s""");

        Scanner console = new Scanner(System.in);
        MenuBar choice;

        try {
            byte userInput = console.nextByte();
            choice = MenuBar.values()[userInput - 1];
        } catch (Exception e) {
            choice = MenuBar.EXIT;
        }

        switch (choice) {
            case SORT:
                bouquet.sortFlowersByFreshness();
                System.out.println("\nFlowers sorted in order of decreasing freshness");
                System.out.println(printFlowers(bouquet.getFlowers()));
                break;

            case FIND:
                System.out.print("\nEnter the lower border of stem length (cm): ");
                double lowerBorder = console.nextDouble();

                System.out.print("Enter the upper border of stem length (cm): ");
                double upperBorder = console.nextDouble();

                System.out.println("\nFound flower");

                boolean found = false;
                for (Flower flower : bouquet.getFlowers()) {
                    if (flower.isInStemRange(lowerBorder, upperBorder)) {
                        System.out.println(printFoundFlower(flower));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Nothing found");
                }

                break;

            case EXIT:
                System.out.println("You entered the wrong number!");
        }

        console.close();
    }

    private static String printFlowers(ArrayList<Flower> flowers) {
        StringBuilder sb = new StringBuilder();

        for (Flower flower : flowers) {
            sb.append(flower.getName()).append(" : ");
            sb.append(flower.getFreshness()).append(" days\n");
        }

        return sb.toString();
    }

    private static String printFoundFlower(Flower flower) {
        return flower.getName() +
                " : " + flower.getStemLength() + " cm";
    }
}
