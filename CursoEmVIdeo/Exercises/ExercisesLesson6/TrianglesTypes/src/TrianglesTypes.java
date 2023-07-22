import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianglesTypes extends JFrame {
    private JSlider sldSide2;
    private JPanel myPanel;
    private JButton btnCheck;
    private JSlider sldSide1;
    private JSlider sldSide3;
    private JLabel lblSide1;
    private JLabel lblSide2;
    private JLabel lblSide3;
    private JLabel lblResult;

    public void setLabelSlide(JSlider sld, JLabel lbl) {
        int sliderValue = sld.getValue();
        lbl.setText(String.valueOf(sliderValue));
    }

    public void setTriangleType(int side1, int side2, int side3){
        if (side1 >= side2+side3 || side2 >= side1+side3 || side3 >= side1+side2
        || side1 == 0 || side2 == 0 || side3 == 0){
            lblResult.setText("This values don't make a triangle");
        } else if (side1 == side2 && side1 == side3){
            lblResult.setText("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            lblResult.setText("Isosceles Triangle");
        } else {
            lblResult.setText("Scalene triangle");
        }
    }

    public TrianglesTypes() {
        setContentPane(myPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setTitle("Triangles Types");
        setLabelSlide(sldSide1, lblSide1);
        setLabelSlide(sldSide2, lblSide2);
        setLabelSlide(sldSide3, lblSide3);



        sldSide1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLabelSlide(sldSide1, lblSide1);
            }
        });
        sldSide2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLabelSlide(sldSide2, lblSide2);
            }
        });
        sldSide3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                setLabelSlide(sldSide3, lblSide3);
            }
        });
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int sldValue1 = sldSide1.getValue();
                int sldValue2 = sldSide2.getValue();
                int sldValue3 = sldSide3.getValue();

                setTriangleType(sldValue1, sldValue2, sldValue3);
            }
        });
    }

    public static void main(String[] args) {
        TrianglesTypes myScreen = new TrianglesTypes();
    }
}
