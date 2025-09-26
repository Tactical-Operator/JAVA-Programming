import java.util.*;
class  magictriplet
{
    public static void main(String[] args)
    {
       int[] arr={1,2,3,4};

       int n=arr.length;
       int count=0;
       
    // Brute Force Method
    //    for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             for (int k = j + 1; k < n; k++) {
    //                 if (arr[i] < arr[j] && arr[j] < arr[k]) {
    //                     count++;
    //                 }
    //             }
    //         }
    //   }


    // Hold a Middle Elmenet and check smaller on left and greater on right
    for(int j=1;j<=n-2;j++){
        int greater=0;
        int smaller=0;

        for(int i=0;i<j;i++){
            if(arr[i]<arr[j]){
                smaller++;
            }
        }

        for(int k=j+1;k<n;k++){
            if(arr[k]>arr[j]){
                greater++;
            }
        }
        count+=smaller*greater;
    }

    System.out.println(count);
   }
}