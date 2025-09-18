import java.util.*;

class secondlargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr.length;
        Arrays.sort(arr);
        int largest =arr[l-1];
        for(int i=l-2;i>=0;i--){
            if(arr[i]<largest){
                System.out.println(arr[i]);
            }
        }

    }

}
