package command;

public class Invoker {

	public static void main(String[] args) {
		Receiver r=new Receiver();
		
		UpperCaseCommand uc=new UpperCaseCommand();
		LowerCaseCommand lc=new LowerCaseCommand();
		
		r.action("heLLo", uc);
		r.action("heLLo", lc);

	}

}
