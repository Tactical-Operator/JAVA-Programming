//Given a string of characters followed by their frequency, compress it into a proper format.
// Input 
// a3b5c2a2

// Output
// abc

import java.util.*;

class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ns = ""; // Initialize ns as an empty string

        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 >= s.length()) { // Check for out-of-bounds
                break;
            }
            int number = s.charAt(i + 1) - '0';
            for (int j = 0; j < number; j++) {
                ns += s.charAt(i); // Concatenate directly
            }
        }
        System.out.println(ns);
    }
}
