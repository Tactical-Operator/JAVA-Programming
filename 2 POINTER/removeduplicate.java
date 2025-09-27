//remove duplicate elements from sorted array

import java.util.*;

class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {4,2,1,4,1,1,5,22,44 };
        int n = arr.length;
        Arrays.sort(arr);

        int i=0;

        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

    }

}


