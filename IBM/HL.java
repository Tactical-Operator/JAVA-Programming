import java.util.Scanner;

class HL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input: Number of elements must be greater than 0.");
            return;
        }

        System.out.println("Enter the numbers:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize HCF and LCM with the first number
        int hcf = numbers[0];
        int lcm = numbers[0];

        // Calculate HCF and LCM for the array
        for (int i = 1; i < n; i++) {
            hcf = findHCF(hcf, numbers[i]);
            lcm = (lcm / hcf) * numbers[i];
        }

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    // Helper method to calculate HCF of two numbers
    private static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
