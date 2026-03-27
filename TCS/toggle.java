// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

// Constrains-

// 1<=N<=100

// Example 1:

// Input :

// 10  -> Integer

// Output :

// 5    -> result- Integer

// Explanation:

// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.
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