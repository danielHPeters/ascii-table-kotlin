package asciitable

/**
 * A simple console application that displays the ascii table.
 *
 * @author Daniel Peters
 */
object AsciiTable {
  /**
   * Maximum amount of columns before line break.
   */
  private val MAX_COLS: Int = 6

  /**
   * Outputs the ascii table to the console window.
   */
  fun drawAsciiTable() {
    for (c in 32..128) {
      System.out.print(c.toString() + ": " +  c.toChar() + "\t")

      if (c % MAX_COLS == 1) {
        System.out.println()
      }
    }
    System.out.println()
  }
}

/**
 * Main method.
 *
 * @param args the command line arguments
 */
fun main(args: Array<String>) {
  AsciiTable.drawAsciiTable()
}
