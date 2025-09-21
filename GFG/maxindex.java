import java.util.*;
class  maxindex
{
    public static void main(String[] args)
    {
       
       int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
       int maxdiff=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
                
                if((arr[i]<=arr[j])&&(i<=j)&&(j-i>maxdiff)){
                    maxdiff=j-i;
                    
                }
            }
        }
        System.out.println(maxdiff);
        
     }
}
