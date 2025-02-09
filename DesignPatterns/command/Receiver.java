package command;

public class Receiver {
	public void action(String text,Command cmd){
		cmd.print(text);
	}
}
