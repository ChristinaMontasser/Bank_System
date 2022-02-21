package bankSystem;
import java.util.Scanner;

/**
 * @author      Kareem Mostafa
 * @author 		Christina Saad
 * @author 		Hossam Hassan
 * @version     1
 * Date:	    4/27/2021
 *
 */

public class main {

	 public static void main(String[] args) {
		 Scanner newScanner = new Scanner(System.in);
		 Bank mainBank = new Bank("CIB", "Cairo", "0114723");
		 int holdAccNumber = 0;
		 while(true) 
		 {
			 System.out.println("1.Create new Account");
			 System.out.println("2.deposite");
			 System.out.println("3.withdraw");
			 System.out.println("4.View all Accounts Data");
			 int userChoice = newScanner.nextInt();
			 if(userChoice == 1)
			 {
				 System.out.println("Press 1 to create normal account or 2 to create special account");
				 int accountChoice = newScanner.nextInt();
				 if(accountChoice == 1)
				 {
					 System.out.println("How much money do you want to put in your account");
					 float accountBalance = newScanner.nextFloat();
					 Account tempAccount = new Account(accountBalance);
					 holdAccNumber = tempAccount.getAccountNumber();
					 System.out.println("Press 1 to become normal client or 2 to become commercial client");
					 int clientChoice = newScanner.nextInt();
					 if(clientChoice == 1)
					 {
						 System.out.println("What is your name: ");
						 String clientName = newScanner.next();
						 System.out.println("What is your phone number: ");
						 String clientNumber = newScanner.next();
						 System.out.println("What is your Address: ");
						 String clientAddress = newScanner.next();
						 System.out.println("What is your National ID: ");
						 String clientID = newScanner.next();
						 Client tempClient = new Client(clientName,clientID,clientAddress,clientNumber, tempAccount);
						 mainBank.addNewClient(tempClient);
					 }
					 else if(clientChoice == 2)
					 {
						 System.out.println("What is your name: ");
						 String clientName = newScanner.next();
						 System.out.println("What is your phone number: ");
						 String clientNumber = newScanner.next();
						 System.out.println("What is your Address: ");
						 String clientAddress = newScanner.next();
						 System.out.println("What is your commercial ID: ");
						 String commericalID = newScanner.next();
						 Client tempClient = new Client(clientName,commericalID,clientAddress,clientNumber, tempAccount);
						 mainBank.addNewClient(tempClient);
						 
					 }
				 }
				 else if(accountChoice == 2)
				 {
					 System.out.println("How much money do you want to put in your account");
					 float accountBalance = newScanner.nextFloat();
					 SpecialAccount tempAccount = new SpecialAccount(accountBalance);
					 holdAccNumber = tempAccount.getAccountNumber();
					 System.out.println("Press 1 to become normal client or 2 to become commercial client");
					 int clientChoice = newScanner.nextInt();
					 if(clientChoice == 1)
					 {
						 System.out.println("What is your name: ");
						 String clientName = newScanner.next();
						 System.out.println("What is your phone number: ");
						 String clientNumber = newScanner.next();
						 System.out.println("What is your Address: ");
						 String clientAddress = newScanner.next();
						 System.out.println("What is your National ID: ");
						 String clientID = newScanner.next();
						 Client tempClient = new Client(clientName,clientID,clientAddress,clientNumber, tempAccount);
						 mainBank.addNewClient(tempClient);
					 }
					 else if(clientChoice == 2)
					 {
						 System.out.println("What is your name: ");
						 String clientName = newScanner.next();
						 System.out.println("What is your phone number: ");
						 String clientNumber = newScanner.next();
						 System.out.println("What is your Address: ");
						 String clientAddress = newScanner.next();
						 System.out.println("What is your commercial ID: ");
						 String commericalID = newScanner.next();
						 Client tempClient = new Client(clientName,commericalID,clientAddress,clientNumber, tempAccount);
						 mainBank.addNewClient(tempClient);

						 
					 }
					 
					 
				 }
				 System.out.println("Your account is successfully created");
				 System.out.println("Your Bank account number is: "+ holdAccNumber +"");
			 }else if(userChoice == 2)
			 {
				 while(true)
				 {
					 System.out.println("What is your bank account");
					 int accNumber = newScanner.nextInt();
					 System.out.println("How much money Do you  want to deposite?");
					 int clientBalance = newScanner.nextInt();
					 if(mainBank.searchForAccount(accNumber) == -1)
					 {
						System.out.println("You have entered a wrong account");
					 }
					 else
					 {
						 mainBank.accounts.get(mainBank.searchForAccount(accNumber)).setBalance(clientBalance);
						 break;
					 }
				 }
				 
			 }else if(userChoice ==3)
			 {
				 while(true)
				 {
					 System.out.println("What is your bank account");
					 int accNumber = newScanner.nextInt();
					 System.out.println("How much money Do you  want to withdraw?");
					 int withdraw = newScanner.nextInt();
					 if(mainBank.searchForAccount(accNumber) == -1)
					 {
						System.out.println("You have entered a wrong account");
					 }
					 else
					 {
						 mainBank.accounts.get(mainBank.searchForAccount(accNumber)).withdraw(withdraw);
						 break;
					 }
				 }
			 }else
			 {
				 mainBank.display();
			 }
		 }
	}
}
