class BankAcc 
{
    private int balance;

    public BankAcc(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
     
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}

public class Customer 
{
    public static void main(String[] args) 
    {
        BankAcc HDFC = new BankAcc(5000);

        int currentBalance = HDFC.getBalance();                                                                                                                   
        System.out.println("balance: " + currentBalance);


        HDFC.setBalance(7000);                                              
        System.out.println("after setter method: " + HDFC.getBalance());

    }
}
