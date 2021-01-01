package src.L2_Patterns;

public class PatternNumber {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;
        int nsp = n - 1;
        int nst = 1;
        int val = 1;
        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print(val);
                cst++;
            }
            row++;
            nsp--;
            nst = nst + 2;
            System.out.println();
        }
    }
}
