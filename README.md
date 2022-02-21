# Bank_System
# Problem 1

We are going to implement a banking system. It's very important to maintain data of each account in the bank. 
So, we need to create an Account class. We will also create a SpecialAccount class that inherits from Account class and has a special feature. 
  - Create Account class.
  - Create balance and account number attributes in account class (private not public) 
  - Create a suitable constructor that sets the account number and the initial balance value. 
  - Create setter and getter for each attribute. 
  - Override the method toString ( ) inherited from class Object to make it return a meaningful string representation of the account information. 
  - Create methods withdraw and deposit to be able to take or put money. To withdraw, enough balance should be available. 
  - Create another class SpecialAccount that inherits from class Account. 
  - Use polymorphism to override method withdraw to allow over drafting with maximum limit of 1000 LE. 
  - Write a main class to test class Account. It should create two accounts of two types and test all the functions you created in them. 

# Problem 2 
We are going to implement a bank system. It is required to implement a Client class to represent the bank’s clients. 
So, you are required to do the following: 
- Create Client class. 
- Add name, nationalID, address, phone and account private attributes for the class.  
- Create a suitable constructor that sets these attributes. (Note that before creating a new Client, you will need to create an object of type Account and pass it as a parameter to the client object’s constructor to be his account). 
- Create setter and getter for each attribute. 
- Override the method toString ( ) inherited from class Object to make it return a meaningful string representation of the client information. String representing Client information, should also include his account’s information. 
- Create another class CommercialClient that inherits from class Client. A commercial client is a company not a person. It has an extra attribute  commercialID and setter and getter for it. Its NationalID is set to 00000000000000. 
- Use polymorphism to override method toString print the commercial client details including his commercial ID instead of the national ID.  
- Write a main class to create two clients of two types and test all the functions you created in them

# Problem 3
Now you have Account and Client classes and their subclasses (assume they exist until your colleagues finish doing the real ones). 
Let's make bank class 
- Create Bank class. 
- Create name, address and phone attributes in Bank class. 
- Create a constructor and suitable setters and getters. 
- Create an ArrayList of accounts in Bank class, this array maintains all accounts’ data. 
- Create an ArrayList of clients in Bank class, this array maintains all clients’ data. 
- Create methods to 

    ➢(1) add a new client and his account (can be special client or commercial account also) 

    ➢(2) display existing clients and their accounts.

    Each time a new client and account are created, they are added to the two ArrayLists of accounts and clients. 
 - Integrate your Bank class with Client and Account classes and use them in it. 
