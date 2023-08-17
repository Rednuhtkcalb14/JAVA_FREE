public class Pen {
    private String model;
    private String color;
    private boolean caped;
    private float tip;





//    public Pen(String m, String c, float t) {
//        this.capPen();
//        this.setModel(m);
//        this.setColor(c);
//        this.setTip(t);
//    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String m){
        this.model = m;
    }

    public float getTip(){
        return this.tip;
    }
    public void setTip(float t){
        this.tip = t;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaped() {
        return caped;
    }
    public void setCaped(boolean c) {
        this.caped = c;
    }

    public void capPen() {
        this.caped = true;
    }
    public void uncapPen() {
        this.caped = false;
    }

    public void status(){
        System.out.println("Pen model: " + this.getModel());
        System.out.println("Pen tip: " + this.getTip());
        System.out.println("Pen color: " + this.getColor());
        System.out.println("Caped pen: " + this.isCaped());
    }
}
