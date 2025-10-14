// Given an array arr[] with non-negative integers representing the height of blocks. 
// If the width of each block is 1, compute how much water can be trapped between the blocks during 
// the rainy season. 

// Input: arr[] = [3, 0, 2, 0, 4]
// Output: 7
// Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.
// Input: arr[] = [1, 2, 3, 4]
// Output: 0
// Explanation: We cannot trap water as there is no height bound on both sides.
// Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
// Output: 9
// Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.

import java.util.*;

class trapping_rain_water {
    public static void main(String[] args) {
        int[] arr = {28,13,47,33,83,72,19,86,37,4,28,22,83,32,9,63,68,92,8,0,39,78,45,33,30,71,6,37,39,35,86,48,13,16,76,34,70,64,31,92,74,0,16,78,57,92,10,96,21,65,20,25,14,34,23,21,96,86,62,82,67,41,32,73,16,9,53,78,66,6,47,69,78,1,14,42,36,17,49,79,59,84,87,61,39,81,70,56,48,5,75,19,58};
        int max_height = 0;
        int n = arr.length;
        int max_height_index = 0;

        for (int i = 0; i < n; i++) {
            if (max_height <= arr[i]) {
                max_height = arr[i];
                max_height_index = i;
            }

        }
        System.out.println(" The Maximum Height Block is " + max_height);

        int left_boundary = arr[0];
        int right_boundary = arr[n-1];

        int left=max_height_index-1;
        int right=max_height_index+1;

        int difference=0;

        int water_blocks=0;

        for(int i=left;i>0;i--){

            if(arr[i]<left_boundary){
            difference=left_boundary-arr[i];
            water_blocks+=difference;
            }

        }
        for(int j=right;j<n;j++){
            if(arr[j]<right_boundary){
            difference=right_boundary-arr[j];
            water_blocks+=arr[j];
            }
        }

        System.out.println(water_blocks);


        // Not Solved Yet , to complete it correctly watch Take You Forsward's Youtube Video
   }
}