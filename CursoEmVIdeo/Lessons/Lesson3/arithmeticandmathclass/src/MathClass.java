public class MathClass {
    public static void main(String[] args) {
        // PI -> constant of pi value;
        // pow -> exponentiation;
        // sqrt -> square root;
        // cbrt -> cubic root.

        // Types of rounding
        // abs -> absolute value;
        // floor -> round down;
        // ceil -> round up;
        // round -> arithmetic rounding.


        float v = 8.9f;
        double floor = Math.floor(v);
        double ceil = Math.ceil(v);
        int rounded = Math.round(v);
        System.out.println(floor);
        System.out.println(ceil);
        System.out.println(rounded);
    }
}
