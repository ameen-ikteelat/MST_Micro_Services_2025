package visitor;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<VisitableString> words=new ArrayList<VisitableString>();
		words.add(new VisitableString("Hello"));
		words.add(new VisitableString("to"));
		words.add(new VisitableString("Java"));
		words.add(new VisitableString("design"));
		words.add(new VisitableString("patterns"));
		words.add(new VisitableString("world"));
		words.add(new VisitableString("!!!"));
		
		FirstLetterVisitor v1=new FirstLetterVisitor();
		LetterCounterVisitor v2=new LetterCounterVisitor();
		
		for(VisitableString vs:words){
			vs.accept(v1);
			vs.accept(v2);
		}
		
		System.out.println("First letters: "+v1.getFirstLetters());
		System.out.println("Letters count: "+v2.getLettersCount());
	}
	
	

}
