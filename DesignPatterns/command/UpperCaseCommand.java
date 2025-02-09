package command;

public class UpperCaseCommand implements Command {

	public void print(String text) {
			System.out.println(text.toUpperCase());
	}

}
