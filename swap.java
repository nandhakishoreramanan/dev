import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (example: 1, 2): ");
        String input = sc.nextLine();

        // Split input using comma
        String[] parts = input.split(",");

        int number1 = Integer.valueOf(parts[0].trim());
        int number2 = Integer.valueOf(parts[1].trim());

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output
        System.out.println("The swapped numbers are");
        System.out.println(number1);
        System.out.println("and");
        System.out.println(number2);

        sc.close();
    }
}