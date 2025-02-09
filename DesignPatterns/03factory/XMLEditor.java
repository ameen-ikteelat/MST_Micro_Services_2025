package factory;

public class XMLEditor extends Editor {

	@Override
	public void edit() {
		System.out.println("XML Editing");
	}

	@Override
	public Validator createValidator() {
		return new XMLValidator();
	}

}
