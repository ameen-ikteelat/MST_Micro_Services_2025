package bridge;

public class ConcreteTabbedPrinterImplementor extends PrinterImplementor {

	@Override
	public void print(String text) {
		char ch[]=text.toCharArray();
		for(char c:ch){
			System.out.print(c+"\t");
		}
		System.out.println();
	}

}
