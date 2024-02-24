package task_1;

/**
 * Class that represents methods for working with numeric sequences
 * @author Ilya Sokol
 */
class NumericSequence {
    int[] sequence;

    public NumericSequence(int len) {
        this.sequence = new int[len];
    }

    public void setElement(int value, int index) {
        sequence[index] = value;
    }

    /**
     * Method that searches for shortest and longest integers in an array
     * and prints it into the console
     * @return 2D-array that contains shortest and longest numbers and its lengths
     */
    public int[][] findShortestAndLongest() {
        int strLength;
        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;
        int shortNumber = 0, longNumber = 0;
        String strNumber;

        for (int number : sequence) {
            strNumber = String.valueOf(number).replaceAll("-", "");
            strLength = strNumber.length();

            if (strLength < minLength) {
                minLength = strLength;
                shortNumber = number;
            }
            if (strLength > maxLength) {
                maxLength = strLength;
                longNumber = number;
            }
        }

        return new int[][]{{shortNumber, minLength}, {longNumber, maxLength}};
    }
}
