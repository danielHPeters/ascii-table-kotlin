package asciitable;

/**
 * A simple console application that displays the ascii table
 *
 * @author d.peters
 */
public class AsciiTable {

    /**
     * Maximum amount of colums before line break
     */
    private static final int MAX_COLS = 6;

    /**
     * Outputs the ascii table to the console window
     */
    public static void drawAsciiTable() {

        for (int c = 32; c < 128; c++) {

            System.out.print(c + ": " + (char) c + "\t");

            if (c % MAX_COLS == 1) {
                System.out.println();
            }

        }

        System.out.println();

    }

    /**
     * Main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AsciiTable.drawAsciiTable();
    }

}
