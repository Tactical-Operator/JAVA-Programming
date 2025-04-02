import java.util.*;

class Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int people = 0;
        int balls = 0;
        for (int i = 1; i <= n; i++) {
            balls += i;
            if (balls <= n) {
                people += 1;
            }

        }
        System.out.println(people);
        sc.close();
    }

}