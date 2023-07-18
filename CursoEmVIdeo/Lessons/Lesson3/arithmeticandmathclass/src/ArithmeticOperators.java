public class ArithmeticOperators {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2 ) / 2;
        System.out.println("The average is " + m);

        System.out.println();
        // Increment Operator
        int n3 = 5;
        int n4 = 5;
        n3++;
        n4++;
        int valor1 = 5 + n3++;  // post increment
        int valor2 = 5 + ++n4;  // pre-increment
        System.out.println(valor1);
        System.out.println(valor2);

        System.out.println();
        // Decrement Operator
        int n5 = 10;
        int n6 = 10;
        int value3 = 5 + n5--;  // post decrement
        int value4 = 5 + --n6;  // pre-decrement
        System.out.println(value3);
        System.out.println(value4);

        System.out.println();
        //Assignment Operators
        // += -> sum and assign
        // -= -> subtract and assign
        // *= -> multiply and assign
        // /= -> split and assign
        // %= -> remainder of division and assign
        int x = 4;
        int y = 3;
        x += 2; // x = x + 2;
        y *= 2; // x = x + 2;
        System.out.println(x);
        System.out.println(y);

    }
}