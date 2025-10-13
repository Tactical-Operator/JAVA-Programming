import java.util.*;

class trapping_rain_water {
    public static void main(String[] args) {
        int[] arr = { 2,1,5,3,1,0,4};
        int max_height = 0;
        int n = arr.length;
        int max_height_index = 0;

        for (int i = 0; i < n; i++) {
            if (max_height < arr[i]) {
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
            difference=left_boundary-arr[i];
            water_blocks+=difference;

        }
        for(int j=right;j<n;j++){
            difference=right_boundary-arr[j];
            water_blocks+=arr[j];
        }

        System.out.println(water_blocks);
   }
}