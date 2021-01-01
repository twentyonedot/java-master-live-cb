package src.L2_Patterns;

/*  for n = 5;
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/
public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        /* No of rows: 5 */
        int row = 1;
        while (row <= n) {
            /* Work */
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            /* Preparation */
            System.out.println();
            row++;
        }
    }
}
