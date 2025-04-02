import java.util.Scanner;

public class d {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while (n-- > 0) {
            String x = s.nextLine();
            int sum = 0, p = 1;
            for (int i = x.length() - 1; i >= 0; i--) {
                sum += x.charAt(i) * p;
                p *= 10;
            }
            System.out.println(sum);
        }
        s.close();
    }
}