public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String eMail;
    private String phoneNumber;


    public void depositFunds(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.accountBalance);
    }

    public void withdrawFunds(double  withdrawalAmount){
        if (this.accountBalance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + this.accountBalance + " in yout account.");
        }else{
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + this.accountBalance);
        }

    }

    public void describeAccount(){
        System.out.println("Account Number = " + accountNumber +
                " Account Balance = " + accountBalance +
                " Customer Name = " + customerName +
                " EMail = " + eMail +
                " Phone Number = " + phoneNumber
        );
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance < 0){
            System.out.println("Account balance cannot be below 0");
        }else{
            this.accountBalance = accountBalance;
        }

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}


