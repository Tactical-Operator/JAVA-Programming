// Input:
// N = 3, K = 2
// Arr[] = {3, 2, 1}
// Output: 3
// Explanation: The subarrays having value
// strictly greater than K are: [3], [3, 2]
// and [3, 2, 1]. Thus there are 3 such
// subarrays.
// Example 2:

// Input:
// N = 4, K = 1
// Arr[] = {1, 2, 3, 4}
// Output: 9
// Explanation: There are 9 subarrays having
// value strictly greater than K.

import java.util.*;
import java.io.*;
class count_of_subarrays 
{
    public static void main(String[] args) throws Exception
    {
       File file=new File("input_for_count_of_subarrays.txt");
       Scanner sc = new Scanner(file);

       int t =sc.nextInt();

       while(t-- >0)
       {
        int n =sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt();

        


       }
    }
}