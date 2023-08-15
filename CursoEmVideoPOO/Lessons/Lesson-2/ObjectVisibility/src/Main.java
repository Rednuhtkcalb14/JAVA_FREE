public class Main {
    public static void main(String[] args) {

        Pen p1 = new Pen();  // c1 is an instance of Pen

        p1.model = "Bic";
        p1.color = "blue";
        // p1.tip = 0.5f; private attribute
        // p1.closed = true;
        p1.charge = 80;
        p1.open();

        p1.status();
        p1.scribble();
    }
}