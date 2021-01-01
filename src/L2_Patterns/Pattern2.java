package src.L2_Patterns;

/* for n = 5;
    *
    **
    ***
    ****
    *****
*/
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;

        int nst = 1;
        while (row <= n) {
            int col = 1;
            while (col <= nst) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
