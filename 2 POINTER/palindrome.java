import java.util.*;

// class palindrome {
//     public static void main(String[] args) {
//         String word = "ARORA";
//         int length = word.length();
//         int l = length - 1;
//         int count = 0;

//         for (int i = 0; i < length/2; i++) {
//             if (word.charAt(i) == word.charAt(l)) {
//                 count++;
//             }
            
//             l--;
//         }
//         if (count == length/2) {
//             System.out.println("Palindrome");
//         }
//     }
// }
   class palindrome{
    public boolean isPalindrome(String s){
      int left=0;
      int right=s.length()-1;

      while(left<right){
         if(s.charAt(left)!=s.charAt(right)){
            return false;
         }
         left++;
         right--;
      }
      return true;
    }
    public static void main(String[] args){
      palindrome ob = new palindrome();
      System.out.println(ob.isPalindrome("MADAM"));
      System.out.println(ob.isPalindrome("arora"));

    }
   }
   