package bankSystem;
/**
 * @author		Christian Saad
 * @version     1
 * @since       1
 * Date:		4/23/2021
 */

/**
 *Client account that handle clients
*/
public class Client {
	private String name;
	private String nationalID;
	private String address;
	private String phone;
	private Account userAccount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
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

	public Account getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(Account userAccount) {
		this.userAccount = userAccount;
	}
	
	public Client()
	{}
	
	/**
	 * Constructor to set properties values
	 *
	 * @param  name the client name
	 * @param  nationalID the normal client national ID
	 * @param  address the client address
	 * @param  phone the client phone number
	 * @param  userAccount an object of type Account
	 */
	public Client(String name,String nationalID, String address,String  phone, Account userAccount)
	{
		this.name = name;
		this.nationalID = nationalID;
		this.address = address;
		this.phone = phone;
		this.userAccount = userAccount;
	}
	
	 /**
     * @return a descriptive words of the account state 
     */
	@Override
	public String toString()
	{
		String description = "User name :" + name+
				             ".\r\nNational ID: "+ nationalID+
				             ".\r\nAddress: " + address+
				             ".\r\nPhone: " + phone+
				             ".\r\nAccount info: "+ userAccount.toString()+
				             ".\r\n------------------";
								
		return description;       
	}
}
