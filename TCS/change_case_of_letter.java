import java.util.*;

class change_case_of_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        System.out.println(sb.toString());
    }
}