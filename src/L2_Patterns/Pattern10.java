package src.L2_Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;

        int nsp = 0;

        int nst = 2 * n - 1;

        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            nsp = nsp + 1;
            nst = nst - 2;
            row++;
            System.out.println();

        }
    }
}
