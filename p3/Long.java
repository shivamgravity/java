package p3;

public class Long {
    public static void main(String[] args) {
        long a, b;
        a = 4000;
        b = 5000;
        // no need for type casing from int
        // because long is bigger than int
        // so during calculation, a and b doesn't get promoted to int.
        long c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
