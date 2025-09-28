import java.util.*;
class reversearray 
{
    public static void main(String[] args)
    {
       int[] arr={1,2,3,4,5};
       int last=arr.length-1;
       int left=0,right=last;

    //    for(int i=0;i<arr.length/2;i++){
    //     int temp=arr[i];
    //     arr[i]=arr[last];
    //     arr[last]=temp;
    //     last--;
    //    }
    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        left++;right--;
    }



       System.out.println(Arrays.toString(arr));
    }
}