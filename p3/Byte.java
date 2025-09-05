package p3;

public class Byte {
    public static void main(String[] args) {
        // initialize a byte type variable;
        byte a,b;
        a = 10;
        b = 100;
        // type casting here is necessary because (a + b) is an int type
        // Java converts them to int before any operation
        byte c = (byte) (a + b);
        System.out.println(a + " + " + b + " = " + c);
    }
}