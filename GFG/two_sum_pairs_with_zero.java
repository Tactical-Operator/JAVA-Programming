import java.util.*;
class two_sum_pairs_with_zero 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       ArrayList <ArrayList<Integer>> result=new ArrayList<>();
       int arr[]={-1, 0, 1, 2, -1, -4};
       Arrays.sort(arr);
       int left=0,right=arr.length-1;
       while(left<right){

        int sum =arr[left]+arr[right];
        if(sum==0){
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(left);
            pair.add(right);
            result.add(pair);

            int leftvalue=arr[left];
            int rigthvalue=arr[right];
         }
       }
    }
}
