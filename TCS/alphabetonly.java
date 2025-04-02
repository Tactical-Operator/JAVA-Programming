import java.util.*;

class alphabetonly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String news = "";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            int cha=(int)ch;
            if ((cha >= 65 && cha <= 90) || (cha >= 97) && (cha <= 122)) {
               news = news + s.charAt(i);
            }
        }
        System.out.println(news);
    }
}