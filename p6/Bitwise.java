package p6;

public class Bitwise {
    public static void main(String[] args) {
        // common variables
        int a = 25;
        int b = 30;

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
    }
}
