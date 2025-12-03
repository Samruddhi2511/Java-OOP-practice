public class BankAcc 
{
    private String accNum;
    private int balance;
    private String accHolderName;

    
    public BankAcc(String accNum, int balance, String accHolderName) 
    {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolderName = accHolderName;
    }
   
    
    public String getAccNumber() 
    {
        return accNum;
    }

    public double getBalance() 
    {
        return balance;
    }

    public String getAccHolderName()
     {
        return accHolderName;
    }

    
    public void setAccNumber(String accNumber) 
    {
        this.accNum= accNum;
    }

    public void setAccHolderName(String accHolderName) 
    {
        this.accHolderName = accHolderName;
    }


    public void setbalance(int balance) 
    {
        if (balance > 0)
        {
            this.balance=balance;
            System.out.println("balance valid");
        } 
        
    }

    
    public static void main(String[] args) 
    {
        
        BankAcc account = new BankAcc("12345", 1000, "Samruddhi");

        System.out.println("Account Number: " + account.getAccNumber());
        System.out.println("Account Holder Name: " + account.getAccHolderName());
        System.out.println("Balance: " + account.getBalance());


    
       

       
    }
}
 
