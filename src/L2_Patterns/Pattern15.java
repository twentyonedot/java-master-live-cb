package src.L2_Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;
        int nst = n;
        int nsp = 0;

        while (row <= 2 * n - 1) {
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

            if (row <= (2 * n - 1) / 2) {
                nst--;
                nsp = nsp + 2;
            } else {
                nst++;
                nsp = nsp - 2;
            }
            row++;
            System.out.println();
        }
    }
}
