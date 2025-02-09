package factory;

public class XMLValidator extends Validator {

	@Override
	public void validate() {
		System.out.println("XML Validating");
	}

	@Override
	public Printer createPrinter() {
		return new XMLPrinter();
	}

}
