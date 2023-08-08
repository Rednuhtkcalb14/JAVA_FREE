public class Factorial {
    private int num = 0;
    private long fat = 1;
    private String formula = "";

    public void setValue(int n){
        num = n;
        long f = 1;
        String s = "";

        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " * ";
        }
        s += "1 = " + f;
        fat = f;
        formula = s;
    }

    public long getFactorial(){
        return fat;
    }

    public String getFormula(){
        return formula;
    }

    public String getHtmlFormula(){
        String htmlForm = "<html>";
        int i = 0;

        for (int c = num; c > 1; c--) {
            i++;
            if (c < 10) {
                htmlForm += "0" + c + " * ";
            } else{
                htmlForm += c + " * ";
            }
            if (i%10 == 0){
                htmlForm += "<br>";
            }
        }
        htmlForm += "01 = " + fat;

        return htmlForm;
    }
}
