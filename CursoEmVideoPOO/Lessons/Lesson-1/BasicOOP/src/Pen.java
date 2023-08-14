public class Pen {
    String model;
    String color;
    float tip;
    int charge;
    boolean closed;

    void status() {
        System.out.println("Model " + this.model);
        System.out.println("A " + this.color + " Pen");
        System.out.println("Tip " + this.tip);
        System.out.println("Is closed? " + this.closed);
        System.out.println("Charge " + this.charge);
    }

    void scribble() {
        if (this.closed) {
            System.out.println("Error, I can't scribble");
        } else {
            System.out.println("Scribbling");
        }
    }

    void close() {
        this.closed = true;  // this is a reference of the object itself
    }

    void open() {
        this.closed = false;
    }
}
