// Moore Voting Algorithm

import java.util.*;

class majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = arr[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ele = arr[i];
                count = 1;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == ele) {
                count++;
            }
        }
        if (count > n / 2) {
            System.out.println(ele);
        } else {
            System.out.println("-1");
        }

    }
}