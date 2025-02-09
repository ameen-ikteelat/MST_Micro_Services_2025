package builder;

public class RegularAccountBuilder extends AccountBuilder {

	@Override
	public void setId() {
		account.setId("Regular -"+AccountBuilder.currAccountId++);
	}

	@Override
	public void setType() {
		account.setType(AccountType.REGULAR);
	}

	@Override
	public void setCommission() {
		account.setCommission(0.5);
	}

}
