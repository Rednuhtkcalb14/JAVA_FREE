import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton btnPayMonthly;
    private JLabel lblMonthly;
    private JLabel lblLastOperation;
    private JPanel bankPanel;
    private JLabel lblBalance;
    private JLabel lblAccountNum;
    private final BankAccount myBankAccount = new BankAccount();

    public void setCreateVisible() {
        createPanel.setVisible(true);
        bankPanel.setVisible(false);
    }

    public void setBankVisible() {
        createPanel.setVisible(false);
        bankPanel.setVisible(true);
    }

    public void setAccount() {
        lblAccountNum.setText(String.valueOf(myBankAccount.getAccountNum()));
        lblBalance.setText(String.valueOf(myBankAccount.getAccountBalance()));
        lblMonthly.setText(String.valueOf(myBankAccount.getMonthly()));
        lblLastOperation.setText("Conta criada");
    }

    public void setBalance(float v, String type) {
        if (type.equals("s")) {
            if (v<=0) {
                lblLastOperation.setText("Operação inválida");
            } else{
                myBankAccount.withdraw(v);
                lblBalance.setText(String.valueOf(myBankAccount.getAccountBalance()));
                lblLastOperation.setText("Sacou: " + v);
            }
        } else if (type.equals("m")) {
            if (v<=0) {
                lblLastOperation.setText("Operação inválida");
            } else{
                myBankAccount.withdraw(v);
                lblBalance.setText(String.valueOf(myBankAccount.getAccountBalance()));
                lblLastOperation.setText("Pagou a mensalidade: " + v);
            }
        }
        else {
            if (v<=0) {
                lblLastOperation.setText("Operação inválida");
            } else{
                myBankAccount.deposit(v);
                lblBalance.setText(String.valueOf(myBankAccount.getAccountBalance()));
                lblLastOperation.setText("Depositou: " + v);
            }
        }
    }

    public Bank(){
        setContentPane(myPanel);
        setVisible(true);
        setTitle("Bank");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setCreateVisible();

        btnCreateCC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                myBankAccount.openAccount("cc");
                setAccount();
                setBankVisible();
            }
        });
        btnCreateCP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                myBankAccount.openAccount("cp");
                setAccount();
                setBankVisible();
            }
        });
        btnDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float money = Float.parseFloat(spnDeposit.getValue().toString());
                setBalance(money, "d");
            }
        });
        btnDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float money = Float.parseFloat(spnDraw.getValue().toString());
                setBalance(money, "s");
            }
        });
        btnPayMonthly.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setBalance(myBankAccount.getMonthly(), "m");
            }
        });
        btnCloseAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(myBankAccount.getStatus() && myBankAccount.getAccountBalance() == 0){
                    myBankAccount.closeAccount();
                    setCreateVisible();
                    spnDraw.setValue(0);
                    spnDeposit.setValue(0);
                } else {
                    lblLastOperation.setText("Operação inválida");
                }

            }
        });
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
    }
}
