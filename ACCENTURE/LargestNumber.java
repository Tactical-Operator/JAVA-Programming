//   ACCENTURE CODING PROBLEM STATEMRNT LARGEST NUMBER COMBINATION
// 3
// 9 93 535
// 993535


import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ele = new String[n];
        for (int i = 0; i < n; i++) {
            ele[i] = sc.next();
        }
        sc.close();
        Arrays.sort(ele, (a, b) -> (b + a).compareTo(a + b));

        if (ele[0].equals("0")) {
            System.out.println("0");
            return;
        }
        StringBuilder largestNumber = new StringBuilder();
        for (String num : ele) {
            largestNumber.append(num);
        }
        System.out.println(largestNumber);
   }
}
