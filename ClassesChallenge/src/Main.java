public class Main {
    public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.setAccountNumber(12345);
            account.setAccountBalance(1000.0d);
            account.setCustomerName("Barış");
            account.seteMail("nostradamiz5@gmail.com");
            account.setPhoneNumber("+95469679687");
//            account.setAccountBalance(25000.458d);
        account.depositFunds(27500);
            account.withdrawFunds(26000);
//        System.out.println(account.getAccountBalance());
        account.describeAccount();
    }
}
