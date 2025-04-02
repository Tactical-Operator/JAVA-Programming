import java.util.*;
class dna_rna
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sequence");
        String str=sc.nextLine();
        System.out.println(str);
        
        String dna="000";
        String dnad="";
        String rna="111";
        String add="";
        String A ="011";
        String C ="001";
        String G ="010";
        String T ="101";
        String U ="110";
        String newString="";
        for(int i=0;i<3;i++)
        {
         add +=str.charAt(i);
        }
        if(add.equals(dna))
        {  
            int c=0;
            for(int i=3;i<str.length();i++)
            {
                dnad+=str.charAt(i);
                c++;
                if(c==3)
                {
                    if(dnad.equals(A))
                    {
                       newString+="A";
                       c=0;
                       dnad="";
                    }
                    if(dnad.equals(G))
                    {
                       newString+="G";
                       c=0;
                       dnad="";
                    }
                    if(dnad.equals(T))
                    {
                       newString+="T";
                       c=0;
                       dnad="";
                    }
                    if(dnad.equals(C))
                    {
                       newString+="C";
                       c=0;
                       dnad="";
                    }
                    if(dnad.equals(U))
                    {
                       newString+="T";
                       c=0;
                       dnad="";
                    }
                }

            }

        }
        System.out.println(newString);

    }
}
