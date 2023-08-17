import javax.swing.*;

public class Bank extends JFrame {
    private JPanel myPanel;
    private JButton btnCreateCC;
    private JButton btnCreateCP;
    private JPanel createPanel;
    private JSpinner spnDeposit;
    private JButton btnDeposit;
    private JButton btnDraw;
    private JSpinner spnDraw;
    private JButton btnCloseAccount;
    private JButton button4;
    private JLabel lblMonthly;
    private JLabel lblLastOperation;
    private JPanel bankPanel;

    public void setCreateVisible() {
        createPanel.setVisible(true);
        bankPanel.setVisible(false);
    }

    public Bank(){
        setContentPane(myPanel);
        setVisible(true);
        setTitle("Bank");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setCreateVisible();
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
    }
}
