import java.util.*;

class smallabsolutedifference {
    public static void main(String[] args) {
        // int arr[] = { 5,7,9,3,4,2,1,8,9,10 };
        // int k = 10;
        // int kthmin=0;
        // int count=0;

        // int n = arr.length;
        // int difference = 0;
        // int diffarraylength = 0;
        // int c = 0;
        // for (int h = 1; h < n; h++) {
        //     diffarraylength = diffarraylength + h;
        // }

        // int[] diffarray = new int[diffarraylength];

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         difference = arr[j] - arr[i];
        //         diffarray[c++] = difference;
        //     }
        // }
        // Arrays.sort(diffarray);

        // for(int m=diffarraylength-1;m>=0;m--){
        //     int digit=diffarray[m];

        //     if(digit<k){
        //         kthmin=digit;
        //         count++;
        //         if(count==k){
        //             break;
        //         }

        //     }
        // }
        // System.out.println("Smallest Absolute Difference ="+kthmin);
        int arr[] = { 5,7,9,3,4,2,1,8,9,10};
        int k=10;
        int kthmin=0;
        int diffarraysize=0;
        int count=0;
        int n=arr.length;
        int c=0;
        
        for(int i=1;i<arr.length;i++){

            diffarraysize=diffarraysize+i;
        }

        int[] diffarray=new int[diffarraysize];

        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                
                int difference=Math.abs(arr[j]-arr[i]);
                diffarray[count++]=difference;
            }
        }
        Arrays.sort(diffarray);
        
        System.out.println(diffarray[k-1]);



    }
}