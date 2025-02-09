package abstractFactory;

public abstract class FormatFactory {
	public abstract Editor getEditor();
	public abstract Validator getValidator();
	public abstract Printer getPrinter();
}
