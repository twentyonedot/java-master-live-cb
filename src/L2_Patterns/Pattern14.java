package src.L2_Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;
        int nst = 1;
        int nsp = n - 1;

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
                nst++;
                nsp--;
            } else {
                nst--;
                nsp++;
            }
            row++;
            System.out.println();
        }
    }
}
