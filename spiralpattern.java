public class spiralpattern {
    public static void main(String[] args) {
        int n=4;
        int x=n+1;
        n=n*2;
        // System.out.println(n);
        for (int row = 1; row < n ; row++) {
            for (int col = 1; col < n ; col++) {
               // System.out.println( row +" "+col +" "+(n-row)+" "+(n-col));
                int f = x - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(f + " ");
            }
            System.out.println();
        }

    }
}
