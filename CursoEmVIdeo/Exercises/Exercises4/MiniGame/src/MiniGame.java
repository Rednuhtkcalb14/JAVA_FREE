import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MiniGame extends JFrame {
    private JPanel myPanel;
    private JButton btnGuess;
    private JSpinner spnValue;
    private JLabel lblAnswer;
    private JLabel lblAttempts;
    private JPanel gamePanel;
    private JButton btnEasy;
    private JPanel difficultPanel;
    private JButton btnMedium;
    private JButton btnHard;
    private JLabel lblLegend;
    private JButton btnRestart;
    private int attempts = 0;
    private final Random random = new Random();
    private int sortedValue;
    private boolean won = false;

    private void visibleButtonRestart() {
        btnRestart.setVisible(true);
        btnGuess.setVisible(false);
    }

    private void visibleButtonGuess() {
        btnGuess.setVisible(true);
        btnRestart.setVisible(false);
    }

    private void visibleDifficultPanel() {
        gamePanel.setVisible(false);
        difficultPanel.setVisible(true);
    }

    private void visibleGamePanel() {
        gamePanel.setVisible(true);
        difficultPanel.setVisible(false);
    }

    private void constructPanelGame(int att, int maxV) {
        attempts = att;
        sortedValue = random.nextInt(maxV);
        lblLegend.setText(String.format("Write a number less than %d", maxV));
        lblAttempts.setText(String.valueOf(attempts));
        spnValue.setValue(0);
        btnRestart.setVisible(false);
    }

    public MiniGame() {
        setContentPane(myPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MiniGame");
        setResizable(false);
        setSize(500, 500);


        visibleDifficultPanel();


        btnEasy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visibleGamePanel();
                visibleButtonGuess();
                constructPanelGame(4, 10);
            }
        });
        btnMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visibleGamePanel();
                visibleButtonGuess();
                constructPanelGame(5, 50);
            }
        });
        btnHard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visibleGamePanel();
                visibleButtonGuess();
                attempts = 6;
                constructPanelGame(6, 100);
            }
        });
        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.out.println(sortedValue);

                int value = (int) spnValue.getValue();

                if (sortedValue == value) {
                    lblAnswer.setText("You Won!!");
                    won = true;
                    visibleButtonRestart();
                } else if (sortedValue < value) {
                    lblAnswer.setText(String.format("Sorted value is less than %d", value));
                } else {
                    lblAnswer.setText(String.format("Sorted value is higher than %d", value));
                }
                attempts -= 1;
                lblAttempts.setText(String.valueOf(attempts));
                if (attempts == 0 && won == false) {
                        lblAnswer.setText(String.format("You lose!! the answer is %d", sortedValue));
                        visibleButtonRestart();
                    }
                }
        });
        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                visibleDifficultPanel();
                lblAnswer.setText("");
            }
        });
    }

    public static void main(String[] args) {
        MiniGame myGame = new MiniGame();
    }
}
