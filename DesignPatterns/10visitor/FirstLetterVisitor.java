package visitor;

public class FirstLetterVisitor implements Visitor {

	private String firstLetters="";
	
	public void visit(VisitableString vs) {
		firstLetters+=vs.getValue().charAt(0)+" ";
	}
	
	public String getFirstLetters(){
		return firstLetters;
	}

}
