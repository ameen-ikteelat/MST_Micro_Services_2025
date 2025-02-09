package strategy;

public class LowerPrint implements PrintStrategy {

	public void print(String text) {
		System.out.println(text.toLowerCase());
	}

}
