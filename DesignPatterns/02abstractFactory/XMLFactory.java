package abstractFactory;

public class XMLFactory extends FormatFactory {

	@Override
	public Editor getEditor() {
		return new XMLEditor();
	}

	@Override
	public Validator getValidator() {
		return new XMLValidator();
	}

	@Override
	public Printer getPrinter() {
		return new XMLPrinter();
	}

}
