package factory;

public class HTMLValidator extends Validator {

	@Override
	public void validate() {
		System.out.println("HTML Validating");
	}

	@Override
	public Printer createPrinter() {
		return new HTMLPrinter();
	}

}
