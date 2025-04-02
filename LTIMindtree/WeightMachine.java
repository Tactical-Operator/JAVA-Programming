public class WeightMachine {

    public static int weightMachine(int N, int[] weights, int T) {
        int totalAmount = 0;
        
        for (int weight : weights) {
            if (weight <= T) {
                totalAmount += 1;
            } else {
                totalAmount += 2;
            }
        }
        
        return totalAmount;
    }

    public static void main(String[] args) {
        // Example usage
        int N = 4;
        int[] weights = {1, 2, 3, 4};
        int T = 3;

        int result = weightMachine(N, weights, T);
        System.out.println(result);  // Output: 5
    }
}