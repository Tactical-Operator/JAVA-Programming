import java.util.*;
class perfectsquareinarange 
{
    public static void main(String[] args)
    {
       int a =9,b=25;

       // O(1) approach 

       int start=(int)Math.sqrt(a);
       int end=(int)Math.sqrt(b);

       if(end<start){
        System.out.println("0 perfect SQUARES");
       }
       else{
        System.out.println(end-start+1);
       }
    }
}