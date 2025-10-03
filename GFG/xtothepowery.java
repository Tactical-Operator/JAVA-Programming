
class xtothepowery {
    public static void main(String[] args) {
        int n = 525;
        boolean found = false;
        int base = 0, exponent = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (Math.pow(i, j) == n) {
        // result = true;

        // base=i;
        // exponent=j;
        // break;

        // }
        // }
        // if(result) break;
        // }

        for (int i = 2; i * i <= n; i++) {
            int power = i * i;
            int j = 2;

            while (power <= n) {
                if (power == n) {
                    found = true;
                    base = i;
                    exponent = j;
                    break;

                }
                j++;
                power *= i;
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println(found + " because " + base + "^" + exponent + " is equal to " + n);
        } else {
            System.out.println(found);
        }
    }
}