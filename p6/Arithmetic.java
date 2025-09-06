package p6;

public class Arithmetic {
    public static void main(String[] args) {
        
        int a,b,sum,diff,mul;
        float div1,div2;

        a = 11;
        b = 5;

        // normal arithmetic operators
        // addition, subtraction, multiplication and division
        sum = a + b;
        diff = a - b;
        mul = a * b;
        div1 = a / b;
        div2 = (float) a / b;

        System.out.println("Normal Arithmetic Operators:");
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + diff);
        System.out.println("Product : " + mul);
        System.out.println("Division 1 : " + div1);
        System.out.println("Division 2 : " + div2);

        // arithmetic assignment operators
        float c = 11;
        
        sum += 1;
        diff -= 1;
        mul *= 2;
        c /= 3;

        System.out.println("\nArithmetic Assignment Operators:");
        System.out.println("Add and Assign : " + sum);
        System.out.println("Subtract and Assign : " + diff);
        System.out.println("Multipy and Assign : " + mul);
        System.out.println("Divide and Assign : " + c);
    }
}
