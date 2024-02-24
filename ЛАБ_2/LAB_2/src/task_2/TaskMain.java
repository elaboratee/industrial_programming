package task_2;

public class TaskMain {
    public static void main(String[] args) {
        printTable();
    }

    private static void printTable() {
        final String HEADER = " * |";
        final String DEMARKER = "\n---|------------";
        final char VERT_DEMARKER = '|';
        final String INTERLINE = "-----------------\n";

        System.out.print(HEADER);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.print(DEMARKER);
        System.out.print(INTERLINE);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d %c", i, VERT_DEMARKER);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.print("\n");
        }
    }
}
