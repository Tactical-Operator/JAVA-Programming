import java.util.*;
class firstlast{
    public static void main(String args[]){
        
        String s="ashwin jadhav";
        
        
        String[] words=s.split(" ");
        System.out.println(Arrays.toString(words));
        int l=words.length;
        String ns="";
        for(int i=0;i<l;i++)
        {
            String temp=words[i];
            for(int j=0;j<temp.length();j++){
                char ch=temp.charAt(j);
                if(j==0 || j==temp.length()-1){
                    ch=Character.toUpperCase(ch);
                    ns+=ch;
                }
                
                else {
                    ns+=ch;
                }
            }
            ns+=" ";
        }
        System.out.println(ns);
        
    }
}

