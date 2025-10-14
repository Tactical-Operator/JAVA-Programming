/* Code based on kadane_but_small to take test cases from a txt file to print different
outputs */ 


import java.util.*;
import java.io.*;
class driver_kadane_but_small 
{
    public static void main(String[] args) throws Exception
    {
       // Create a File object for input.txt
        File file = new File("input.txt");

        // Scanner will now read from the file instead of console
        Scanner sc = new Scanner(file);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int currentSum = arr[0];
            int minSum = arr[0];

            for (int i = 1; i < arr.length; i++) {
                currentSum = Math.min(arr[i], currentSum + arr[i]);
                minSum = Math.min(minSum, currentSum);
            }

            System.out.println(minSum);
        }

        sc.close();
    }
}