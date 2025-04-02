import java.util.*;

class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int c = 0, count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                }
            }
            if (c == 1) {
                count++;
            }
            c = 0;
        }
        System.out.println(count);
    }
}
