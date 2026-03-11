/**
 * OOPSBannerApp - Use Case 6
 * Uses static helper methods to generate character patterns.
 * Demonstrates modular design and DRY principle.
 *
 * @author nandhakishro
 * @version 6.0
 */
public class oopsbannerapp6 {

    public static void main(String[] args) {

        String[] o1 = buildO();
        String[] o2 = buildO(); // Reuse method
        String[] p  = buildP();
        String[] s  = buildS();

        // Combine letters row by row
        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[] {
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[] {
                " ******",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                "*     *",
                " ***** "
        };
    }
}