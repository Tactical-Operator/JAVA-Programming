//  IBM- fREQUENCY PERCENTAGE OF ALL NuMBERS

//  Input-
//  11,duration,10,seconds,Ab46dddj,identity,fly,hours,11,wonders,10,Serial,98duysss,10
//  
//  Output-
//  10 60%
//  11 40%

import java.util.*;

class DigitFrequency {
    static boolean isNumber(String s) {
        int lx = s.length();
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                c++;
            }
        }
        if (c == lx)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String[] arr = { "16", "15", "15", "15", "16", "11", "duration", "10", "seconds", "Ab46dddj", "identity", "fly",
                "hours", "11", "wonders", "10", "Serial", "98duysss", "10" };
        List<Integer> list = new ArrayList<>();
        int l = arr.length;
        for (String x : arr) {
            if (isNumber(x)) { 
                list.add(Integer.parseInt(x));
            }

        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int x:list) {
            map.put(x,map.getOrDefault(x,0)+1);
            
        }
        int b=list.size();
        for(Map.Entry<Integer,Integer> key :map.entrySet())
        {
            
            System.out.println(key.getKey() + " "+ (int)((double)(key.getValue()*100)/b)+"%");

    }

}
}

