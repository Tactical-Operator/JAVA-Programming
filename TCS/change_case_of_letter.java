import java.util.*;

class change_case_of_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            // if (Character.isUpperCase(ch)) {
            //     sb.setCharAt(i, Character.toLowerCase(ch));
            // }
            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
                s=s.replace(s.charAt(i),ch);
            }

        }
        
        System.out.println(s);
    }
}