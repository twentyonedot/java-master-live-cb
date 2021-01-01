package src.L3_NS;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 100101;
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int rem = binary % 10;
            binary /= 10;
            decimal = decimal + rem * (int) Math.pow(2, power);
            power++;
        }
        System.out.println(decimal);
    }
}
