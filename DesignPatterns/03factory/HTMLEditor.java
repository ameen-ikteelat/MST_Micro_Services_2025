package factory;

public class HTMLEditor extends Editor {

	@Override
	public void edit() {
		System.out.println("HTML editing");
	}

	@Override
	public Validator createValidator() {
		return new HTMLValidator();
	}

}
