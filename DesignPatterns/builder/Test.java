package builder;

public class Test {

	public static void main(String[] args) {
		
		RegularAccountBuilder r=new RegularAccountBuilder();
		GoldAccountBuilder g=new GoldAccountBuilder();
		PlatinumAccountBuilder p=new PlatinumAccountBuilder();
	
		//build regular account:
		createAndPrintAccount(r);
		createAndPrintAccount(g);
		createAndPrintAccount(p);
		
		
	}
	
	public static void createAndPrintAccount(AccountBuilder builder){
		AccountDirector director=new AccountDirector();
		director.setAccountBuilder(builder);
		director.constructAccount();
		Account account = director.getAccount();
		System.out.println(account);
	}

}
