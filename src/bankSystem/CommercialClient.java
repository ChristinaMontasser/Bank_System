package bankSystem;
/**
 * @author      Christina Saad
 * @version     1
 * @since       1
 * Date:		4/23/2021
 */


/**
 *Derived class
 *a special case of class @see Client
*/
public class CommercialClient extends Client {
	private String commercialID;

	public String getCommercialID() {
		return commercialID;
	}
	public void setCommercialID(String commercialID) {
		this.commercialID = commercialID;
	}

	/**
	 * Constructor to set properties values by passing them to the parent class
	 *
	 * @param  name the client name
	 * @param  commercialID the commercial client commercial ID
	 * @param  address the client address
	 * @param  phone the client phone number
	 * @param  userAccount an object of type Account
	 */
	public CommercialClient(String name, String commercialID ,String address,String  phone, Account userAccount)
	{
		super(name, "00000000000000", address, phone, userAccount);
		this.commercialID= commercialID;
	}
	
	 /**
     * @return a descriptive words of the account state 
     */
	public String toString()
	{
		String describtion= super.toString();
		describtion= describtion.replace("National ID: 00000000000000.", "Commercial ID: "+ getCommercialID());
		return describtion;
	}
}
