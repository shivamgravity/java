package p6;

public class Bitwise {
    public static void main(String[] args) {
        // common variables
        int a = 25;
        int b = 30;
        byte c = 10;

        // Logical Operators: & | ^ ~

        // ~ bitwise unary NOT
        // reverses all the bits
        int na = ~a;
        System.out.println("~" + a + " = " + na);

        // & bitwise AND
        // gives 1 only if both bits are 1
        int aANDb = a & b;
        System.out.println(a + " & " + b + " = " + aANDb);

        // | bitwise OR
        // gives 1 if at least 1 is present
        int aORb = a | b;
        System.out.println(a + " | " + b + " = " + aORb);

        // ^ exclusive OR
        // gives 1 if one is 0 and other is 1 else 0
        int aXORb = a ^ b;
        System.out.println(a + " ^ " + b + " = " + aXORb);

        // Logical Operators ENDS ------

        // << left shift (value << num)
        // shifts the bits, num times to left side
        // be careful about how many bits each data type have
        int shiftL1c = c << 2;
        byte shiftL2c = (byte) (c << 2);
        System.out.println(c + " << 2 (converted to int) = " + shiftL1c);
        System.out.println(c + " << 2 (byte as original) = " + shiftL2c);

        // >> right shift (value >> num)
        // shifts the bits, num times to right side
        // 0 gets added to the MST each time a bit is shifted to right
        int shiftR1c = c >> 2;
        byte shiftR2c = (byte) (c >> 2);
        System.out.println(c + " >> 2 (converted to int) = " + shiftR1c);
        System.out.println(c + " >> 2 (byte as original) = " + shiftR2c);
    }
}
