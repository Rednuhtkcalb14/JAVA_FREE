import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class ScreenAge extends JFrame {
    private JTextField txtBornYear;
    private JButton btnClick;
    private JLabel lblSituation;
    private JLabel lblAge;
    private JPanel myPanel;
    private JSpinner spnBornYear;

    public ScreenAge() {
        setContentPane(myPanel);
        setTitle("ScreenAge");
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int bornYear = (int) spnBornYear.getValue();
                int age = Year.now().getValue() - bornYear;
                lblAge.setText(String.valueOf(age));
                String situation = (age>=16 && age<18) || (age > 70) ? "Optional Voting" : "Compulsory Voting";
                lblSituation.setText(situation);
            }
        });
    }

    public static void main(String[] args) {
        ScreenAge myScreen = new ScreenAge();
    }
}
