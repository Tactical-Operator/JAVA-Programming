import java.util.*;

class maximizwnumberof1 {
    public static void main(String[] args) {
        int[] arr = { 1,0,0,1,0,1,0,1};
        int k = 2;
        int maxlength = 0;
        int length=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int zeroes = 0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    zeroes++;

                }
                if(zeroes<=k ){
                    length=j-i+1;
                    maxlength=Math.max(maxlength,length);

                }
                else{
                    break;
                }
            }
        }
        System.out.println(maxlength);

    }
}