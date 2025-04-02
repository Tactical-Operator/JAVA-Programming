// sort 0s 1s 2s in ascending order

import java.util.*;
import java.util.Arrays;

class sort012 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zero = 0, one = 0, two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }
        for (int i = zero + one; i < n; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));

    }
}