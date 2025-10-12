// kadane's algorithm with smallest sum possible out of a subarray from the given array

import java.util.*;

class kadane_but_small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements to fill the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int Current_Sun=arr[0];
        int Maximum_Sum=arr[0];

        for(int i=1;i<arr.length;i++){
            Current_Sun=Math.min(arr[i],Current_Sun+arr[i]);

            Maximum_Sum=Math.min(Maximum_Sum,Current_Sun);
        }
        System.out.println(Maximum_Sum);

    }
}