public class lec6part4 {
    public static void main(String[] args) {
        // Logical operators
        int a = 25;
        int b = 10;
        int c = 15;
        boolean d = (a < b) && (b < c);
        System.out.println(d); // false

        // Bitwise operators
        int bitA = 2;
        int bitB = 3;
        int bitAnd = bitA & bitB;
        int bitOr = bitA | bitB;
        int bitXor = bitA ^ bitB;
        int bitNot = ~bitA;

        int h = 1;
        h = h << 33;
        System.out.println(h); // 2

        byte i = 127;
        byte j = (byte) (i >> 8);
    }
}