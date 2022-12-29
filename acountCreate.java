package welcome;
public class InSufficientFundException extends RuntimeException {
	 
    private String message;
 
    public InSufficientFundException(String message) {
        this.message = message;
    }
 
    public InSufficientFundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
 
}


public class acountCreate {
	public static void main(String[] args) {
		private int balance = 3000;
		 
	    public int balance() {
	        return balance;
	    }
	 
	    public void withdraw(int amount) throws InSufficientFundException {
	        if (amount > balance) {
	            throw new InSufficientFundException(String.format(
	                    "Current balance %d is less than requested amount %d",
	                    balance, amount));
	        }
	        balance = balance - amount;
	    }
	 
	    public void deposit(int amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException(String.format(
	                    "Invalid deposit amount %s", amount));
	        	}
	    }
	}
	
	 
	public class Test {
	 
	    public static void main(String args[]) {
	        Account acct = new Account();
	        System.out.println("Current balance : " + acct.balance());
	        System.out.println("Withdrawing $200");
	        acct.withdraw(200);
	        System.out.println("Current balance : " + acct.balance());
	        acct.withdraw(3500);
	 
	    }
	 
	}


	