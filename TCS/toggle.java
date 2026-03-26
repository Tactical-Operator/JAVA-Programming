import java.util.*;
class toggle 
{
    public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
       int integer=sc.nextInt();
       int dividend=integer;
       int remainder=0;
       String s="";

       while(dividend>0){
        remainder=dividend%2;
        dividend=dividend/2;
        s=remainder+s;//at start
        
        }
       
       String result="";
       int length_of_string=s.length();
       for(int i=0;i<length_of_string;i++){
        if(s.charAt(i)=='1'){
            result=result+0;

        }
        else{
            result=result+1;
        }

       }

       //binary to decimal converstion
       int length_of_result=result.length();
       int sum=0;
       int power=0;
       for(int i=length_of_result-1;i>=0;i--){
        int number=result.charAt(i)-'0';
        sum = sum + (number * (int)Math.pow(2, power));
        power++;

       }

       
       System.out.println(sum);
    }
}