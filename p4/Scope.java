package p4;

public class Scope {
    public static void main(String[] args) {
        int bar = 1;
        // inner scope created using nested block.
        {
            // inner scope can update the out scope declared variables
            // and the effects will be permanent.
            bar = 4;
            System.out.println("Inner scope : " + bar);
        }
        System.out.println("Main scope : " + bar);

        {
            int newBar = 10;
            System.out.println("newBar : " + newBar);
        }
        // System.out.println(newBar); will give compile time error here
        // inner scope variables can't be accessed from outside.
    }
}