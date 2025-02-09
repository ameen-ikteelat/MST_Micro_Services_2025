package abstractFactory;

public class PlainFactory extends FormatFactory {

	@Override
	public Editor getEditor() {
		return new PlainEditor();
	}

	@Override
	public Validator getValidator() {
		return new PlainValidator();
	}

	@Override
	public Printer getPrinter() {
		return new PlainPrinter();
	}

}
