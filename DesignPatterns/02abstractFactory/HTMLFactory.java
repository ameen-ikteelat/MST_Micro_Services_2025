package abstractFactory;

public class HTMLFactory extends FormatFactory {

	@Override
	public Editor getEditor() {
		return new HTMLEditor();
	}

	@Override
	public Validator getValidator() {
		return new HTMLValidator();
	}

	@Override
	public Printer getPrinter() {
		return new HTMLPrinter();
	}

}
