import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterScreen extends JFrame {
    private JList<Object> lstCounter;
    private JSlider sldStart;
    private JSlider sldEnd;
    private JSlider sldStep;
    private JButton btnCounter;
    private JPanel myPanel;
    private JLabel lblStart;
    private JLabel lblEnd;
    private JLabel lblStep;

    public void setLbl(JSlider sld, JLabel lbl) {
        String sldValue = String.valueOf(sld.getValue());
        lbl.setText(sldValue);
    }

    public CounterScreen() {
        setContentPane(myPanel);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Counter Screen");

        setLbl(sldStart, lblStart);
        setLbl(sldEnd, lblEnd);
        setLbl(sldStep, lblStep);

        // Label change values
        sldStart.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLbl(sldStart, lblStart);
            }
        });
        sldEnd.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLbl(sldEnd, lblEnd);
            }
        });
        sldStep.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLbl(sldStep, lblStep);
            }
        });


        btnCounter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int startValue = sldStart.getValue();
                int endValue = sldEnd.getValue();
                int stepValue = sldStep.getValue();

                DefaultListModel<Object> myList = new DefaultListModel<>();

                for (int i = startValue; i <= endValue; i+=stepValue){
                    myList.addElement(i);
                }
                
                lstCounter.setModel(myList);
            }
        });
    }

    public static void main(String[] args) {
        CounterScreen myScreen = new CounterScreen();
    }
}
