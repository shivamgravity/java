package p3;

public class Char {
    public static void main(String[] args) {
        char a, b, c, d, e, g;
        int f;

        a = 98;
        b = 99;
        // need to type cast because a -> int and (a + 1) -> int.
        c = (char) (a + 1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        d = (char) (2*a);
        System.out.println("d = " + d);

        e = 'A';
        e = (char) (1000*e);
        System.out.println("e = " + e);

        f = e;
        System.out.println("f = " + f);

        g = e;
        System.out.println("g = " + g);
    }
}
