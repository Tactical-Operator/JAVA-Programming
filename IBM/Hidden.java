import java.util.*;

class Hidden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        String ns="";
        int arr[] = new int[100];
        if (l < 10) {
            System.out.println("Invalid Input");
            return;
        }
        if (isPrime(l)) {
            System.out.println("Invalid Input");
            return;
        }
        int c = 0;
        for (int i = 1; i <= l; i++) {
            if (l % i == 0) {
                arr[c] = i;
                System.out.println(arr[c]);
            }
            c++;
        }
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(arr[i]-1);
            if(ch==' ')
            {
                ch=s.charAt(arr[i]);
                ns+=ch;
            }
            else{
                ns+=ch;
            }
        }

    }

    static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
