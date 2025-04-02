import java.util.*;

class maxandindex2 {

    public static void maxandindexx(int arr[], int length) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < length; i++) {
            m.put(arr[i], i);
        }
        int me = Collections.max(m.keySet());
        System.out.println(Collections.max(m.keySet()) + " " + m.get(me));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxandindexx(arr, arr.length);
        sc.close();

    }
}