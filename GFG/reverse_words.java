import java.util.*;

class reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="..home....";

        String[] arr = s.split("\\.");

        String ans = "";

        // Traverse from back
        for (int i = arr.length - 1; i >= 0; i--) {

            // Ignore empty strings
            if (!arr[i].equals("")) {

                // Add dot only if ans already has something
                if (ans.length() > 0) {
                    ans += ".";
                }

                ans += arr[i];
            }
        }

        System.out.println(ans);
    }
}
