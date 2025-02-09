package command;

public class LowerCaseCommand implements Command {

	public void print(String text) {
		System.out.println(text.toLowerCase());
	}

}
