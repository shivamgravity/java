package p2;

public class Division {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        int r1 = a/b;
        double r2 = a/b;
        System.out.println("Integer: " + r1); // outputs 6
        System.out.println("Double: " + r2); // outputs 6.0 but why not 6.6666...
    }
}
