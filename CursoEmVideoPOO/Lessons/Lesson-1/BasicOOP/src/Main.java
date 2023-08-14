public class Main {
    public static void main(String[] args) {

        Pen p1 = new Pen();  // c1 is an instance of Pen

        p1.model = "Bic";
        p1.color = "blue";
        p1.tip = 0.5f;
        p1.close();  // attribute reference
        p1.status();  // method reference
        p1.scribble();

        System.out.println();

        Pen p2 = new Pen();

        p2.model = "Faber Castell";
        p2.color = "black";
        p2.open();
        p2.scribble();

        /*
        * p1 and p2 are two different instances of the same class
        */
    }
}
