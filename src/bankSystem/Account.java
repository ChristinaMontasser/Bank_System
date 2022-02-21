package bankSystem;
/**
 * @author      Hossam Hassan
 * @version     1
 * @since       1
 * Date: 		4/21/2021
 */

/**
 *Account class that handles clients accounts 
 */
public class Account {
    private float balance;
    int accountNumber;
    /**
     * default constructor
     */
    public Account(){}
    /**
     * Parameterized constructor to set balance
     * @param balance the amount of money that the client wants to put inside his account
     */
    public Account(float balance)
    {
        accountNumber=(int)(Math.random()*100);
        this.balance=balance;
    }
    /**
     * To set account number
     * @param accountNumber the client input account number
     */
    public void setAccount_number(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() 
    {
        return accountNumber;
    }
    /**
     * To set balance, it adds the added balance to the current one
     * @param balance the amount of money that the client wants to put inside his account
     */
    public void setBalance(float balance) 
    {
        this.balance += balance;
    }
    public float getBalance() 
    {
        return balance;
    }
    /**
     * @return a descriptive words of the account state 
     */
    public String toString() 
    {
        return "Account{" + "balance=" + balance + ", accountNumber=" + accountNumber +'}';
    }
    
    /**
     * To withdraw with a normal account, your balance must be greater than or equal to the withdrawn
     * @param withdrawn the amount of money that the client wants to take
     */
    public void withdraw(int withdrawn) 
    {
        if (balance>=withdrawn)
        {
            balance=balance-withdrawn;
            System.out.println("balance is equal: "+balance);
            System.out.println("process has succeeded");
        }
        else
        {
            System.out.println("process has cancelled");
        }
    }
    /**
     * deposit is to put money in your balance
     * @param deposit the amount of money that the client wants to put in his account
     */
    public void deposit(int deposit) 
    {
        balance=balance+deposit;
        System.out.println("balance is equal: "+balance);
    }
}
