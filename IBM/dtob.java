import java.util.Scanner;

 class dtob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the number to binary manually
        StringBuilder binaryNumber = new StringBuilder();

        int num = decimalNumber;
        while (num > 0) {
            binaryNumber.insert(0, num % 2); // Get the remainder and prepend it
            num /= 2;
        }

        // If the number is 0, output "0"
        if (binaryNumber.length() == 0) {
            binaryNumber.append("0");
        }

        // Print the binary representation
        System.out.println("Binary representation: " + binaryNumber);

        scanner.close();
    }
}