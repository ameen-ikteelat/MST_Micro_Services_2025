package builder;

public class AccountDirector{
	private AccountBuilder builder;

	public void setAccountBuilder(AccountBuilder builder){ this.builder=builder;}
	public Account getAccount(){ return builder.getAccount(); }

	public void constructAccount(){
		builder.createNewAccount();
		builder.setId();
		builder.setType();
		builder.setCommission();
	}
}

