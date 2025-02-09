package builder;

import java.util.Calendar;

abstract class AccountBuilder{
	protected static int currAccountId=0;
	protected Account account;
	
      public Account getAccount() {
		return account;
	}
      public void createNewAccount(){
		account = new Account();
	}
      
      
	public abstract void setId();
    public abstract void setType();
	public abstract void setCommission();
	
	public void setStartDate(){
		account.setStart(Calendar.getInstance());
	}
	
}

