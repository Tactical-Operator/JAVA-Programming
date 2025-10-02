

class xtothepowery {
    public static void main(String[] args) {
        int n = 27;
        boolean result = false;
        int x=0,y=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.pow(i, j) == n) {
                    result = true;
                    
                    x=i;
                    y=j;
                    break;
                    
                }
            }
            if(result) break;
        }
        System.out.println(result+" because "+x+"^"+y+" is equal to "+n);
    }
}