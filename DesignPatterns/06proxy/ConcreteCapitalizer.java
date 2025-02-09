package proxy;

public class ConcreteCapitalizer implements Capitalizer {

	public String modify(String text) {
		return text.toUpperCase();
	}

}
