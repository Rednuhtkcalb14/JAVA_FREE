import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialScreen extends JFrame {
    private JSpinner spnValue;
    private JButton btnCalc;
    private JLabel lblFormula;
    private JPanel myPanel;
    private final Factorial myFactorial = new Factorial();


    public FactorialScreen(){
        setContentPane(myPanel);
        setSize(850, 400);
        setTitle("Factorial Screen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int value = (int) spnValue.getValue();

                myFactorial.setValue(value);

                lblFormula.setText(myFactorial.getHtmlFormula());
            }
        });
    }

    public static void main(String[] args) {
        FactorialScreen myScreen = new FactorialScreen();
    }
}
