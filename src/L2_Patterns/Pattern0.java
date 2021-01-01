package src.L2_Patterns;

/* for n = 5;
    *
    *
    *
    *
    *
*/
/*
    Rows - ?
    Work - ?
    Variable Modification - ?
*/
public class Pattern0 {
    public static void main(String[] args) {

        int n = 5;
        /* No of rows: 5 */
        int row = 1;

        while (row <= n) {
            // Work
            System.out.print("*");
            // Prep for next row
            System.out.println();
            row++;
        }

    }
}
