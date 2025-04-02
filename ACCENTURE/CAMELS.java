//CAMEL CASE PROBLEM

import java.util.Scanner;
class CAMELS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter ThE StRiNg OR DIE");
        String s = sc.nextLine();
        String str = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(ch[i])) {
                str += Character.toUpperCase(ch[i]);
            } else if (Character.isUpperCase(ch[i])) {
                str += " " + Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(str);
        String[] ar = str.split("\\s+");
        for (String x : ar)
            System.out.println(x);

      sc.close();
    }
}
// saveChangesInTheEditor
// save Changes In The Editor
