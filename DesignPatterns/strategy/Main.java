package strategy;

public class Main {

	public static void main(String[] args) {
		Sentence s=new Sentence();
		s.addWord("Hello");
		s.addWord("World");
		s.addWord("!!");
		
		s.printSentence();
		
		s.setPrinter(new UpperPrint());
		s.printSentence();
		
		s.setPrinter(new LowerPrint());
		s.printSentence();
	}

}
