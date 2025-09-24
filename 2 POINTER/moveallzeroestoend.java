
//given an integer array [1,3,0,0,12,0] make this to [1.3,12,0,0,0]

import java.util.*;
class  moveallzeroestoend
{
    public static void main(String[] args)
    {
       int[] arr={1,3,0,0,12,0};
        int n = arr.length;

        int slow = 0; // position to place next non-zero

        for (int fast = 0; fast < n; fast++) {
            if (arr[fast] != 0) {
                // swap arr[slow] and arr[fast] if needed
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;

                slow++; // move slow pointer
            }
        }

        // print result
        System.out.println(Arrays.toString(arr));
    }
}