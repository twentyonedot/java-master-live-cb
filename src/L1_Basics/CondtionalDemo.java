package src.L1_Basics;

public class CondtionalDemo {
    public static void main(String[] args) {
        int marks = 20;
        /* Condtional Statement: 'if else', 'else if' */
        /* Logical AND Operator: '&&' */
        /* Logical OR Operator: '||' */
        if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("B");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
