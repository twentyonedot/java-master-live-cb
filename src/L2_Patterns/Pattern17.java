package src.L2_Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;

        int row = 1;
        int nst = n / 2;
        int nsp = 1;

        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }

            if (row <= n / 2) {
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
