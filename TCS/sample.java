import java.util.*;

class sample // Main instead of sample

{
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      String input = sc.nextLine();

      ArrayList<Integer> list = new ArrayList<>();

      String elements[] = input.split(" ");
      for (String token : elements) {
         n = Integer.parseInt(token);
         list.add(n);

      }
      for (int a : list) {
         System.out.print(a + " ");
      }
      sc.close();
   }
}