import java.util.*;

class maxandindex {

    public static void maxandindexx(int arr[], int length) {
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        int b = a[length - 1];
        for (int j = 0; j < length; j++) {
            if (b == arr[j]) {
                System.out.print(b+" " +j);
                
            }
        }

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