import java.util.*;

class optcopy{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String student = sc.nextLine();
        String rahul = sc.nextLine();
        
        // Direct case-insensitive comparison
        if (student.equalsIgnoreCase(rahul)) {
            System.out.println("1");
            return;
        }

        // Convert rahul into a set for quick lookup
        Set<Character> rahulSet = new HashSet<>();
        for (char ch : rahul.toUpperCase().toCharArray()) {
            rahulSet.add(ch);
        }

        // Count matching characters
        int c = 0;
        for (char ch : student.toUpperCase().toCharArray()) {
            if (rahulSet.contains(ch)) {
                c++;
            }
        }

        // If all characters of 'rahul' are found in 'student'
        System.out.println(c == rahulSet.size() ? "1" : "0");
    }
}
