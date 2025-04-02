import java.util.*;
class largest2ndlargest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,5,22,2,3,66,55};
        Arrays.sort(arr);
        System.out.println(arr[6]);
        System.out.println(arr[5]);
        sc.close();;
    }
}
