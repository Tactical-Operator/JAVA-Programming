import java.util.*;

class kardane {
    public static void main(String[] args) {
        //int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        //Brute Force approach O(n^2) Time Complexity
        // int left = 0, right = 0;
        // int sum = 0;
        // int maximum_sum = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        //     sum = 0;
        //     left = i;
        //     while (left < arr.length) {

        //         sum = sum + arr[left];
        //         left++;
        //         if (sum > maximum_sum) {
        //             maximum_sum = sum;
        //         }
        //     }
        // }
        // System.out.println(maximum_sum);


        // Optimized Code with Kardane's Algorithm with O(n) time complexity

        int arr[]={-2,-3,4,-1,-2,1,5,-3};

        int currentSum=arr[0];
        int maximumSum=arr[0];
         for (int i = 1; i < arr.length; i++) {
            // either start new subarray at arr[i], or extend previous one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // update max if the current sum is better
            maximumSum = Math.max(maximumSum, currentSum);


         }
        System.out.println(maximumSum);
        // 

    }
}