// Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

// So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.

// Count the number of Sunday jack will get within n number of days.

//  Example 1:

// Input :

// mon-> input String denoting the start of the month.

// 13  -> input integer denoting the number of days from the start of the month.

// Output :

// 2    -> number of days within 13 days.

// Explanation:

// The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

// Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.

import java.util.*;

class sunday {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);
        map.put("sun", 7);

        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toLowerCase();
        int n = sc.nextInt();
        int val = map.get(day);
        int sunday = 0;

        int days_to_sunday = (7 - val);// days to first sunday

        if (days_to_sunday == 0)
            days_to_sunday = 7; // if start is Sunday
        if (days_to_sunday < n) {
            sunday = 1 + (n - days_to_sunday) / 7;
        }
        System.out.println(sunday);

    }
}