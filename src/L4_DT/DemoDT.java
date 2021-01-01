package src.L4_DT;

public class DemoDT {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        b = (byte)s;
        System.out.println(b);
        for (byte j = 0; j <= 128; j++) {
            System.out.println(j);
        }
    }
}
