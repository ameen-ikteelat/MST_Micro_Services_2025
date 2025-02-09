package factory;

public class PlainEditor extends Editor {

	@Override
	public void edit() {
		System.out.println("Plain Editing");
	}

	@Override
	public Validator createValidator() {
		return new PlainValidator();
	}

}
