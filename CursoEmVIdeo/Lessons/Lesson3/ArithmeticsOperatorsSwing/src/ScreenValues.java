import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenValues extends JFrame {
    private JPanel myPanel;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSplit;
    private JLabel lblResult;
    private JLabel lblRest;
    private JButton btnReset;

    public ScreenValues() {
        setContentPane(myPanel);
        setVisible(true);
        setSize(500, 500);
        setTitle("ScreenValues");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnSplit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num1 = Integer.valueOf(txtNum1.getText());
                int num2 = Integer.valueOf(txtNum2.getText());

                float division = num1 / num2;
                float rest = num1 % num2;
                lblResult.setText(String.valueOf(division));
                lblRest.setText(String.valueOf(rest));
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtNum1.setText("");
                txtNum2.setText("");
                lblResult.setText("0");
                lblRest.setText("0");
            }
        });
    }

    public static void main(String[] args) {
        ScreenValues myScreen = new ScreenValues();
    }
}
