public class bankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public bankAccount()
    {

    }
    public bankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this. accountNumber = accountNumber;
        this. accountHolderName = accountHolderName;
        this. balance = balance;
    }
        public void setaccountNumber(int accountNumber)
        {
            this. accountNumber = accountNumber;
        }
        public int getaccountNumber()
        {
            return accountNumber;
        }
        public void setaccountHolderName(String accountHolderName)
        {
            this. accountHolderName = accountHolderName;
        }
        public String getaccountHolderName()
        {
            return accountHolderName;
        }
        public void setbalance(double balance)
        {
            this. balance = balance;
        }
        public double getbalance()
        {
            return balance;
        }
        public double deposit (double amount)
        {
            this. balance = balance + amount ;
        }
        public double withdraw(double amount)
        {
            this. balance = balance - amount;
        }
        public void transfer(bankAccount obj, double amount)
        {
            this. balance = this. balance-amount;
            obj. balance = obj.balance + amount;
        }

        public static void main(String[]args)
        {
            bankAccount a1 = new bankAccount(1340,"SAKIF KHAN",100000000);
            bankAccount a2 = new bankAccount(2230,"TASNIM KHAN",300000000);
            a1.transfer(a2,500000);
        }
        



    

    
}
