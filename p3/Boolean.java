package p3;

public class Boolean {
    public static void main(String[] args) {
        boolean a, b;
        a = true;
        b = false;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        if (a) {
            System.out.println("this runs.");
        }

        if (b) {
            System.out.println("this doesn't run.");
        }

        if (a || b) {
            System.out.println("true OR false runs.");
        }

        if (a && b) {
            System.out.println("true AND false doesn't run.");
        }
    }
}
