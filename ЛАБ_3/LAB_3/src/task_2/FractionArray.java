package task_2;

import java.util.ArrayList;

/**
 * Class that provides methods to work with RationalFraction instances
 * @author Ilya Sokol
 */
class FractionArray {
    private final ArrayList<RationalFraction> objectArray = new ArrayList<>();
    private int length = 0;

    /**
     * @return length of a FractionArray instance
     */
    private int getLength() {
        return length;
    }

    public void addFraction(RationalFraction fraction) {
        objectArray.add(fraction);
        length++;
    }

    public ArrayList<RationalFraction> getArray() {
        return objectArray;
    }

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
