import java.util.*;

class sort_characters_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ls = s.length();
        int ascii_array[]=new int[ls];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int ascii = (int) ch;
            ascii_array[i]=ascii;

        }
        s="";
        Arrays.sort(ascii_array);
        System.out.println(Arrays.toString(ascii_array));
        System.out.println(s);


        for(int i=0;i<ls;i++){
            int ascii=ascii_array[i];
            char ch=(char)ascii;
            s=s+ch;

        }
        System.out.println(s); 

        // char[] arr = s.toCharArray();  // direct conversion

        // Arrays.sort(arr);              // sort characters

        // s = new String(arr);           // back to string

        // System.out.println(s);

    }
}