package bankSystem;
import java.util.ArrayList; 

/**
 * @author      Kareem Mostafa
 * @version     1
 * @since       1
 * Date:		4/24/2021
 */



/**
 *Bank class that is the core class of the build the system 
*/
public class Bank {
	private String name;
	private String address;
	private String phone;
	public ArrayList<Account> accounts;
	public ArrayList<Client> clients;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * Parameterized constructor to bank info
	 * @param name the bank name
	 * @param address the bank address
	 * @param phone the bank phone number
	 */
	public Bank(String name,String address, String  phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		accounts = new ArrayList<Account>();
		clients = new ArrayList<Client>();
	}
	/**
	 * Function to add client 
	 * Adding a client meaning adding account too, it calls @see {@link Bank#addNewAccount(Account)}
	 * @param client an object from Client class
	 */
	public void addNewClient(Client client)
	{
		clients.add(client);
		addNewAccount(client.getUserAccount());
	}
	/**
	 * Private function to add account
	 * It's private because this process is already done through adding client process
	 * @param account an object from Account class
	 */
	private void addNewAccount(Account account)
	{
		accounts.add(account);
	}
	/**
	 * function of searching for an account index by its account number
	 * @param accountNumber the client account number
	 * @return index where account is found, or -1 not found
	 */
	public int searchForAccount(int accountNumber)
	{
		for(int i = 0; i < accounts.size();i++)
		{
			if(accounts.get(i).getAccountNumber()== accountNumber)
			{
				return i;
			}
		}
		return -1;
	}
	/**
	 * Function to display information about bank's clients
	 */
	public void display()
	{
		for(int i=0; i<clients.size(); i++)
		{
			System.out.println(clients.get(i).toString());
		}
	}
}
