package src.L3_NS;



public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 37;
        int binary = 0;
        int power = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            decimal /= 2;
            binary = binary + rem * (int) Math.pow(10, power);
            power++;
        }
        System.out.println(binary);
    }
}
