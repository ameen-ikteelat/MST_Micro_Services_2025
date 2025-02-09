package strategy;

public class UpperPrint implements PrintStrategy {

	public void print(String text) {
		System.out.println(text.toUpperCase());
	}

}
