import java.util.Scanner;

public class IT24300246Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Ensure the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Separate and print each digit
            String numberStr = Integer.toString(number);
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
        }

        scanner.close();
    }
}
