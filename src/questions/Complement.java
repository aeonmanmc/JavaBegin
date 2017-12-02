package questions;

public class Complement {

    static int toBin(int x) {
        String y = Integer.toBinaryString(x);

        char[] bytes = y.toCharArray();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == '1') bytes[i] = '0';
            else if (bytes[i] == '0') bytes[i] = '1';
        }

        String z = new String(bytes);
        return Integer.parseUnsignedInt(z, 2);
    }

    public static void main(String[] args) {
        System.out.println(toBin(100));
    }
}
