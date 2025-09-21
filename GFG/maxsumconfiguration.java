import java.util.*;
class maxsumconfiguration 
{
    public static void main(String[] args)
    {
    //    int[] arr={4,1,2,3};
    //    int n=arr.length;
    //    int max=0;

    //    for(int i=0;i<n;i++){

    //     int sum=0;

    //     for(int j=0;j<n;j++){
    //         sum+=arr[j]*j;
    //     }
    //     if(max<sum){
    //         max=sum;
    //     }

    //     rotateByOne(arr,n);
    //    }
    //    System.out.println(max);
    // }
    // static void rotateByOne(int[]arr,int n){
    //     int last =arr[n-1];
    //     for(int i=n-1;i>0;i--){
    //         arr[i]=arr[i-1];
    //     }
    //     arr[0]=last;
         int[] arr = {3, 1, 2, 8};   // example input
        int n = arr.length;

        // Step 1: calculate sum of array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        // Step 2: calculate initial weighted sum
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += arr[i] * i;
        }

        int maxVal = currVal;  // track maximum

        // Step 3: use relation to get next values
        for (int i = 1; i < n; i++) {
            currVal = currVal + arrSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
        }

        System.out.println("Maximum sum of i*arr[i] across rotations = " + maxVal);





        }
        
}
