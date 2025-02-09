
package builder;

public class PlatinumAccountBuilder extends AccountBuilder {

	@Override
	public void setId() {
		account.setId("Platinum-"+AccountBuilder.currAccountId++);
	}

	@Override
	public void setType() {
		account.setType(AccountType.PLATINUM);
	}

	@Override
	public void setCommission() {
		account.setCommission(0.15);
	}

}
