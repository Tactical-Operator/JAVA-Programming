// https://onlinegdb.com/hJMGcfI4O
public class KeyPadPhone
{ 
    static int findTime(String str){   
        int res = 0;
        
        for(char x : str.toCharArray()){
            if(x=='a'||x=='d'||x=='g'||x=='j'||x=='m'||x=='p'||x=='t'||x=='w')
                res+=1;
            if(x=='b'||x=='e'||x=='h'||x=='k'||x=='n'||x=='q'||x=='u'||x=='x')
                res+=2;
            if(x=='c'||x=='f'||x=='i'||x=='l'||x=='o'||x=='r'||x=='v'||x=='y')
                res+=3;
            if(x=='s'||x=='z')
                res+=4;
        }
        
        for(int i = 0; i<str.length()-1;i++){
            int f = (int)str.charAt(i);
            int s = (int)str.charAt(i+1);
            if(f>=97 && f<=99 && s>=97 && s<=99)
                res+=1;
            if(f>=100 && f<=102 && s>=100 && s<=102)
                res+=1;
            if(f>=103 && f<=105 && s>=103 && s<=105)
                res+=1;
            if(f>=106 && f<=108 && s>=106 && s<=108)
                res+=1;
            if(f>=109 && f<=111 && s>=109 && s<=111)
                res+=1;
            if(f>=112 && f<=115 && s>=112 && s<=115)
                res+=1;
            if(f>=116 && f<=118 && s>=116 && s<=118)
                res+=1;
            if(f>=119 && f<=122 && s>=119 && s<=122)
                res+=1;
        }
        return res;
    }
	public static void main(String[] args) {
		String str = "ceat"; 
		System.out.println(findTime(str));
	}
}