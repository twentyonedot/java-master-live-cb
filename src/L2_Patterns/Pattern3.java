package src.L2_Patterns;

/*  for n = 5;
    *****
    ****
    ***
    **
    *
*/
public class Pattern3 {
    public static void main(String[] args) {
        final int n = 5;
        int row = 1;

        int nst = 5;

        while (row <= n) {
            int col = 1;
            while (col <= nst) {
                System.out.print("*");
                col++;
            }

            System.out.println();
            nst--;
            row++;

        }
    }
}
