package task_2;

import java.util.ArrayList;

/**
 * Class that provides methods to work with RationalFraction instances
 * @author Ilya Sokol
 */
class FractionArray {
    private final ArrayList<RationalFraction> objectArray = new ArrayList<>();
    private int length = 0;

    // Getters and setters
    /**
     * @return length of a FractionArray instance
     */
    private int getLength() {
        return length;
    }

    // Methods
    /**
     * Adds rational fraction to the FractionArray instance
     * @param fraction rational fraction to add
     */
    public void addFraction(RationalFraction fraction) {
        objectArray.add(fraction);
        length++;
    }

    public ArrayList<RationalFraction> getArray() {
        return objectArray;
    }

    /**
     * Modifies rational fractions that have even indexes by adding
     * the following rational fraction
     */
    public void modifyEvenIndexes() {
        RationalFraction elementToInsert;
        for (int i = 0; i < length; i += 2) {
            if (i == length - 1) {
                break;
            }
            elementToInsert = objectArray.get(i).add(objectArray.get(i + 1));
            objectArray.set(i, elementToInsert);
        }
    }
}
