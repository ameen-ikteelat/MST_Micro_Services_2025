package builder;

public class GoldAccountBuilder extends AccountBuilder {

	@Override
	public void setId() {
		account.setId("Gold -"+AccountBuilder.currAccountId++);
	}

	@Override
	public void setType() {
		account.setType(AccountType.GOLD);
	}

	@Override
	public void setCommission() {
		account.setCommission(0.3);
	}

}
