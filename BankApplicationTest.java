/**
 * Complete the code so that both the print statements return true
 */
public class BankApplicationTest {
	public static void main(String[] args) {
    	BankAccount account = new BankAccount();
    	account.setAccountName("vj");
    	account.setAccountBalance(45.0);
    	
    	boolean withdrawLess = account.canWithdraw(20.0);
    	boolean withdrawMore = account.canWithdraw(60.0);
    	
    	System.out.println("WithdrawLess test result: "+ (withdrawLess==true? "pass":"fail"));
    	System.out.println("WithdrawMore test result: "+ (withdrawMore==false? "pass":"fail"));
	}
}

class BankAccount {
	String accountName;
	Double accountBalance;
	
	public void setAccountName(String name) {
		accountName = name;
	}
	
	public void setAccountBalance(Double balance) {
		accountBalance = balance;
	}
	
	public boolean canWithdraw(Double money) {
		return accountBalance-money>0;//you can only withdraw the amount you have in account balance
	}
}
