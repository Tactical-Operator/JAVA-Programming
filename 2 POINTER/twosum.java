import java.util.*;
class twosum 
{
    public static void main(String[] args)
    {
       int[] arr={15,7,2,11,14,12,4,5,8,1};
       int target=9;
       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<arr.length;i++){

        int complement=target-arr[i];

        if(map.containsKey(complement)){
            System.out.println((map.get(complement))+","+i);
        }
        map.put(arr[i],i);
       }
    
    }
}