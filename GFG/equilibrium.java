import java.util.*;

class equilibrium {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        int totalsum=0;
        for(int x :arr){
            totalsum+=x;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<arr.length;i++)
        {
            rightsum=totalsum-leftsum-arr[i];

            if(rightsum==leftsum){
                System.out.println(arr[i]);
                break;
                
            }
        }
        if(true){
            System.out.println(-1);
        }
        
    }
}