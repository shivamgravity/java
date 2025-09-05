package p3;

public class Short {
    public static void main(String[] args) {
        short a, b;
        a = 100;
        b = 1000;
        // type casting is necessary because during runtine,
        // short is promoted to int type.
        short c = (short) (a + b);
        System.out.println(a + " + " + b + " = " + c);
    }
}
