package src.L2_Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst1 = 1;
        int nst2 = 1;
        int nsp = 2 * n - 3;
        while (row <= n) {
            int cst1 = 1;
            while (cst1 <= nst1) {
                System.out.print("*");
                cst1++;
            }
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst2 = 1;

            while (cst2 <= nst2) {
                System.out.print("*");
                cst2++;
            }

            nsp = nsp - 2;

            nst1++;
            row++;
            if (row != n) {
                nst2++;
            }
            System.out.println();
        }
    }
}
