/**
 * OOPSBannerApp - Use Case 4
 * Prints the word "OOPS" using String array and loop.
 * Improves modularity and reusability.
 *
 * @author nandhakishore
 * @version 4.0
 */
public class oopsbannerapp {

    public static void main(String[] args) {

        // Store banner lines inside an array
        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ******",
                        " ******"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "****** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}