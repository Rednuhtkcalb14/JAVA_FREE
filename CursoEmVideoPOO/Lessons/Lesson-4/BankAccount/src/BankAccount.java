import java.util.Random;

public class BankAccount {
    public int accountNum;
    protected String accountType;
    private String bankOwner;
    private float accountBalance;
    private boolean status;
    private float monthly;

    public BankAccount() {
        this.setStatus(false);
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getBankOwner() {
        return bankOwner;
    }
    public void setBankOwner(String bankOwner) {
        this.bankOwner = bankOwner;
    }

    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNum() {
        return this.accountNum;
    }
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public float getMonthly() {
        return monthly;
    }
    public void setMonthly(float monthly) {
        this.monthly = monthly;
    }

    public String openAccount(String accountType){
        Random random = new Random();
        int rand = random.nextInt(1000, 10000);
        if(accountType.equals("cc") && !this.status) {
            this.setStatus(true);
            this.setAccountBalance(50);
            this.setMonthly(12);
            this.setAccountNum(rand);
            return "CC account open";
        } else if(accountType.equals("cp") && !this.status){
            this.setStatus(true);
            this.setAccountBalance(150);
            this.setMonthly(20);
            this.setAccountNum(rand);
            return "CP account open";
        }
        return "You just have an account";
    }

    public void closeAccount() {
        if (this.getAccountBalance() == 0 && this.status && this.accountBalance >= 0) {
            this.setStatus(false);
        }
    }

    public void deposit(float money) {
        if (this.status) {
            this.accountBalance += money;
        }
    }

    public void payMonthly() {
        if(this.status) {
            this.accountBalance -= this.monthly;
        }
    }

    public void withdraw(float money) {

    }
}
