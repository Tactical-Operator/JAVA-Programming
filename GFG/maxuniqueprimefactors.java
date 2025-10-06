//Input:
// N = 3
// Output:
// 1
// Explanation:
// No number in the range 1 to 3
// can have more than 1 unique
// Prime factor. So, the Output is 1.

// Input:
// N = 500
// Output:
// 4
// Explanation:
// No number in the range 1 to 500
// can have more than 4 unique
// Prime factors. So, the Output is 4.
// An example of a number with 4
// unique Prime Factors is 210.

import java.util.*;

class maxuniqueprimefactors {

    static int uniquefactorscount(long a) {
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
        long product = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (product > a / arr[i]) {
                break;
            }
            product *= arr[i];
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int result = uniquefactorscount(n);
        System.out.println(result);

    }
}