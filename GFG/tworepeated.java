import java.util.*;
class tworepeated
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        Map<Integer,Integer> map =new HashMap<>();

        int[] result=new int[2];
        int idx=0;

        for(int number:arr){
            map.put(number,map.getOrDefault(number, 0)+1);

            if(map.get(number)==2){
                result[idx++]=number;
                if(idx==2){
                    break;
                }
            }
        }
        for(int x:result){
            System.out.print(x);
        }
    }
}