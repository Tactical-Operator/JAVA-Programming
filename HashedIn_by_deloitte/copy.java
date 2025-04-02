import java.util.*;
class copy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String student=sc.nextLine();
        String rahul=sc.nextLine();
        int ls=student.length();
        int lr=rahul.length();
        int c=0;
        student=student.toUpperCase();
        rahul=rahul.toUpperCase();
        if(student.equals(rahul)){
            System.out.println("1");
        }
        for(char x:student.toCharArray()){
         for(char y:rahul.toCharArray()){
            if(x==y){
                c++;
            }
         }
        }
        if(c==lr){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
}