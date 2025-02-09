package bridge;

public class ConcreteUpperPrinterImplementor extends PrinterImplementor {

	@Override
	public void print(String text) {
		System.out.println(text.toUpperCase());
	}

}
