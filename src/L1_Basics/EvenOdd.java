package src.L1_Basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /* Modulus Operator: '%' - Gives us the remainder */

        /* Conditional Statements: 'if else' */

        /* Comparision Operator: '==' */

        /* Taking Input from the User */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        /* System.out.println("Value of n is: " + n); */
        if (n % 2 == 0) {
            System.out.println("Given Number is Even.");
        } else {
            System.out.println("Given Number is Odd.");
        }
        scn.close();
    }
}
