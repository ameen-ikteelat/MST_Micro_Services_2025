package abstractFactory;

public class PlainValidator extends Validator {

	@Override
	public void validate() {
		System.out.println("Plain Validating");
	}

}
