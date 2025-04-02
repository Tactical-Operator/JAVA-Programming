//ACCNTURE CODING PROBLEM STATEMENT POWER OF 2
// 64
//6
import java.util.*;

class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = -1;
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if ((int) Math.pow(2, i) == n) {
                p = i;
            }
        }
        System.out.println(p);
        sc.close();
     }
}