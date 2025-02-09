package visitor;

public class VisitableString {
	private String value;
	
	public VisitableString(String value){
		this.value=value;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
	public String getValue(){
		return value;
	}
}
