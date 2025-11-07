import java.util.*;

class maximizwnumberof1 {
    public static void main(String[] args) {
        int[] arr = { 1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int maxlength = 0;
        int lengthofsubarray=0;
        int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     int zeroes = 0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]==0){
        //             zeroes++;

        //         }
        //         if(zeroes<=k ){
        //             lengthofsubarray=j-i+1;
        //             maxlength=Math.max(maxlength,lengthofsubarray);

        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println(maxlength);
        //
        

        int l=0,r=0,zeroes=0;
        while(r<n){
            if(arr[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(arr[l]==0){
                    zeroes--;
                    
                }
                l++;
            }
            if(zeroes<=k){
                lengthofsubarray=r-l+1;
                maxlength=Math.max(maxlength, lengthofsubarray);
            }r++;
            
        }
        System.out.println(maxlength);

    }
}