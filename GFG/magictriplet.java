import java.util.*;
class  magictriplet
{
    public static void main(String[] args)
    {
       int[] arr={2,3,4,9,10,12,14,15};

       int n=arr.length;
       int count=0;

       for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] < arr[j] && arr[j] < arr[k]) {
                        count++;
                    }
                }
            }
      }
      System.out.println(count);
   }
}