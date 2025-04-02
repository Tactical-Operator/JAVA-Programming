import java.util.*;

class digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Take input
        sc.close();

        int sum = 0;
        String[] numbers = s.split("\\D+");
        System.out.println(Arrays.toString(numbers)); // Split by non-digit characters

        for (String num : numbers) {
            if (!num.isEmpty()) { // Avoid empty strings
                sum += Integer.parseInt(num);
            }
        }

        System.out.println(sum); // Output the result
    }
}
