import java.util.*;
class dna_opt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sequence");
        String str = sc.nextLine();
        
        
        Map<String, String> map = new HashMap<>();

        map.put("011", "A");
        map.put("001", "C");
        map.put("010", "G");
        map.put("101", "T");
        map.put("110", "T");

        
        if (str.startsWith("000"))
        {
            StringBuilder newString = new StringBuilder();
            for (int i = 3; i < str.length(); i += 3) {
                
                String triplet = str.substring(i, Math.min(i + 3, str.length()));
                

                newString.append(map.getOrDefault(triplet,""));
            }

            System.out.println(newString.toString());
        }
         
    }
}
