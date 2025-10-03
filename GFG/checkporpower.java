import java.util.*;

class checkporpower {
    public static void main(String[] args) {
        int x = 3, y = 44;
        boolean result = false;

        for (int i = 1; i < y; i++) {
            if (Math.pow(x, i) == y) {
                result = true;
            }
        }
        System.out.println(result);
    }
}
