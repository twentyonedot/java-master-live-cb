package src.L1_Basics;

public class VariableDemo {
    public static void main(String[] args) {
        /* TYPE variableName = value */
        /* Assignment Operator: '=' */
        /*
         * int x = 10; System.out.println("Value of x is: " + x);
         */
        /* Division Operator: '/' */
        int principal = 1000;
        int rate = 6;
        int time = 2;
        int simpleInterest;
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is " + "Rs." + simpleInterest);
    }
}
