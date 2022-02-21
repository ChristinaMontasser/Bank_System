package bankSystem;
/**
 * @author      Hossam Hassan
 * @version     1
 * @since       1
 * Date:		4/21/2021
 */


/**
 *Derived class
 *a special case of class @see Account
*/
class SpecialAccount extends Account {
	
/**
 * Constructor it's Parameterized to set balance of the parent class 
 * @see Account#Account(float)
 * @param balance the client account balance
*/
 public SpecialAccount(float balance) {
	 
     super(balance);
 }
 
 /**
  * @Override {@link Account#withdraw(int)}
  * As it's a special account, it's allowed to withdraw even if its balance 
  * smaller than the withdrawn value, but to a certain limit.
  * @exception BalanceException
     *              if the balance ==-1000
     *              cancel the process
  * @param withdrawedMoney
 */
 public void withdraw(int withdrawedMoney) {
     if (getBalance() - withdrawedMoney >= -1000) { 
         setBalance(-withdrawedMoney);
         System.out.println("balance is equal: " + getBalance());
         System.out.println("process has succeeded");
     } else {
         System.out.println("process has cancelled you don't have enough balance");
     }
 }

}
