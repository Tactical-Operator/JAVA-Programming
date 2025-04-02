import java.util.*;
class dectobin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int q=n;
        String s="";
        while(q>=1){
            int r=q%2;
            s=r+s;
            q=q/2;
        }
        System.out.println(s);
    }
}