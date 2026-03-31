import java.util.*;

class element_rank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String array_elements = sc.nextLine();
        String elements[] = array_elements.split(" ");

        int n = elements.length;

        int test_array[] = new int[n];
        int extra_array[] = new int[n];
        int result_array[] = new int[n];

        // Convert string → int
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(elements[i]);
            test_array[i] = val;
            extra_array[i] = val; // copy
        }

        // Sort copy
        Arrays.sort(extra_array);

        // Find rank
        for (int i = 0; i < n; i++) {
            int num = test_array[i];

            for (int j = 0; j < n; j++) {
                if (num == extra_array[j]) {
                    result_array[i] = j + 1; // assign rank
                    break; // VERY IMPORTANT
                }
            }
        }

        System.out.println(Arrays.toString(result_array));
    }
}