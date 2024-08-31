package task_2;

public class BankAccount {
     double balance;
	
     public BankAccount(double initialBalannce) 
     {
    	 if(initialBalannce >0)
    	 {
    		 this.balance=initialBalannce;
    	 }
    	 else
    	 {
    		 System.out.println("Initaial balance cannot be negative. ");
    		 this.balance=0;
    	 }
     }
     
     public void withdraw(double amount)
     {
    	 if(amount > 0&& amount <= balance)
    	 {
    		 balance -=amount;
    		 System.out.println("withdrew :"+amount);
    	 }
    	 else
    	 {
    		 System.out.println("Indufficient funds or invalide amount");
    	 }
    	
     }
     public void deposit(double amount)
     {
    	 if (amount >0)
    	 {
    		 balance +=amount;
    		 System.out.println("deposited: "+amount);
    	 }
    	 else
    	 {
    		 System.out.println("deposited amount must bepositive");
    	 }
     }
     public void displayBalanance()
     {
    	 System.out.println("Account Balance: "+balance);
     }
     
	public static void main(String[] args)
	{
		
		BankAccount account=new BankAccount(1000);
		
		account.displayBalanance();
		account.deposit(200);
		account.displayBalanance();
		account.withdraw(300);
		account.displayBalanance(); 
	}

}
