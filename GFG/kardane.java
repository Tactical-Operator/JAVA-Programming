import java.util.*;

class kardane {
    public static void main(String[] args) {
        int[] arr = {5,4,1,7,8};
        int left = 0, right = 0;
        int sum = 0;
        int maximum_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            left = i;
            while (left < arr.length) {

                sum = sum + arr[left];
                left++;
                if (sum > maximum_sum) {
                    maximum_sum = sum;
                }

            }

        }
        System.out.println(maximum_sum);

    }
}