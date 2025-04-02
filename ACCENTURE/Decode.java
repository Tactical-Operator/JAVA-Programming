//2
//abc   ACCENTURE CODING ASSESSMENT QUESTION
//ABC
//10779
//7227

// 97*10^3+98*10^2+99*10^1

import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            String str = s[j];
            int l = str.length();
            for (int k = 1; k < (l + 1); k++) {
                char ch = str.charAt(k - 1);
                sum += (ch * Math.pow(10, l - k));

            }
            System.out.println(sum);
            sum = 0;
        }
        sc.close();
    }
}

//2
//abc
//ABC
//10779
//7227


//aLTERNATE unecessary solution given by chat gpt


// public class d {
//     public static void main(String[] a) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         s.nextLine();
//         while (n!= 0) {
//             String x = s.nextLine();
//             int sum = 0, p = 1;
//             for (int i = x.length() - 1; i >= 0; i--) {
//                 sum += x.charAt(i) * p;
//                 p *= 10;
//             }
            
//         }System.out.println(sum);
//         s.close();
//     }
// }
