import java.util.*;
class replacezero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String s =Integer.toString(n);
        int sl=s.length();
        String ns="";
        for(int i=0;i<sl;i++){
            if(s.charAt(i)=='0'){
                ns=ns+"1";
            }
            else if(s.charAt(i)=='1'){
                ns=ns+"1";
            }
            else{
                ns=ns+s.charAt(i);
            }
        }
        System.out.println(ns);
    }
}
