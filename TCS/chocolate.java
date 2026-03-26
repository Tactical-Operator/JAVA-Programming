import java.util.*;;

class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[] result_array = new int[n];
        int arr[] = { 4, 5, 0, 1, 9, 0, 5, 0 };
        int l = arr.length;
        int result_array_index = 0;
        // for(int i=0;i<l;i++){
        // if(arr[i]!=0){
        // result_array[result_array_index++]=arr[i];
        // }
        // }
        // while(result_array_index<n){
        // result_array[result_array_index++]=0;
        // }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[result_array_index];
                arr[result_array_index] = arr[i];
                arr[i] = temp;
                result_array_index++;

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
