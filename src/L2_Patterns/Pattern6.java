package src.L2_Patterns;

/* for n = 5;
    *
   **
  ***
 ****
*****
*/
public class Pattern6 {
    public static void main(String[] args) {
        final int n = 5;

        int row = 1;
        int nst = n;
        int nsp = 0;

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

            System.out.println();
            nsp = nsp + 2;
            nst--;
            row++;
        }
    }
}
