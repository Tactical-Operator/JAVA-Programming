
// [2,7,11,15], TARGET =9;
// OUTPUT=[0,1]
import java.util.*;

    class targetelementsum {
    public static void main(String args[]) {
        // BRUTE FORCE APPROACH

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int array[] = new int[n];
        // for (int i = 0; i < n; i++) {

        // array[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {

        // if (i != j) {

        // if ((array[i] + array[j]) == target) {
        // System.out.println(i + "" + j);
        // return;
        // }
        // }
        // }
        // }
        // sc.close();

        // OPTIMAL SOLUTION

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of the array
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        sc.close();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - array[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return;
            }

            // Store the current number with its index
            map.put(array[i], i);
        }

        System.out.println("No pair found");
        

    }
}
