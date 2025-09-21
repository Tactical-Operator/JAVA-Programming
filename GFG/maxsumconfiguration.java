import java.util.*;
class maxsumconfiguration 
{
    public static void main(String[] args)
    {
       int[] arr={4,1,2,3};
       int n=arr.length;
       int max=0;

       for(int i=0;i<n;i++){

        int sum=0;

        for(int j=0;j<n;j++){
            sum+=arr[j]*j;
        }
        if(max<sum){
            max=sum;
        }

        rotateByOne(arr,n);
       }
       System.out.println(max);
    }
    static void rotateByOne(int[]arr,int n){
        int last =arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

        }
        
}
