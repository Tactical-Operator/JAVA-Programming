import java.util.*;
class floor_in_a_sorted_array 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int arr[]={6};
       int x=2;
       int position=0;

       for(int i=arr.length-1;i>=0;i--){
        if(x<arr[i]){
            position=i-1;
            break;
        }
       }
       
    System.out.println(position);
}
}