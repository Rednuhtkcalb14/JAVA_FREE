public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int charge;
    private boolean closed;

    public void status() {
        System.out.println("Model " + this.model);
        System.out.println("A " + this.color + " Pen");
        System.out.println("Tip " + this.tip);
        System.out.println("Is closed? " + this.closed);
        System.out.println("Charge " + this.charge);
    }

    public void scribble() {
        if (this.closed) {
            System.out.println("Error, I can't scribble");
        } else {
            System.out.println("Scribbling");
        }
    }

    public void close() {
        this.closed = true;  // this is a reference of the object itself
    }

    public void open() {
        this.closed = false;
    }
}