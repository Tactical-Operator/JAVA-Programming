import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static int minBorrowAmount(int N, int[] earnArray, int[] costArray) {
        // Create an array of pairs (earnings, costs)
        int[][] books = new int[N][2];
        for (int i = 0; i < N; i++) {
            books[i][0] = earnArray[i];
            books[i][1] = costArray[i];
        }

        // Sort books by cost (books[i][1])
        Arrays.sort(books, Comparator.comparingInt(book -> book[1]));

        int currentSavings = 0;
        int totalBorrowed = 0;

        for (int i = 0; i < N; i++) {
            int earning = books[i][0];
            int cost = books[i][1];

            currentSavings += earning;

            if (currentSavings < cost) {
                totalBorrowed += (cost - currentSavings);
                currentSavings = 0;  // After borrowing, savings are effectively zero for this book
            } else {
                currentSavings -= cost;
            }
        }

        return totalBorrowed;
    }

    public static void main(String[] args) {
        // Example usage
        int N = 3;
        int[] earnArray = {3, 2, 5};
        int[] costArray = {7, 4, 2};

        int result = minBorrowAmount(N, earnArray, costArray);
        System.out.println(result);  // Output: 5
    }
}
