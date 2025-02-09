package strategy;

public class Sentence {
	
	private StringBuffer buffer=new StringBuffer();
	private PrintStrategy printer=null;
	
	public void addWord(String word){
		buffer.append(" "+word);
	}

	public PrintStrategy getPrinter() {
		return printer;
	}

	public void setPrinter(PrintStrategy printer) {
		this.printer = printer;
	}
	
	public void printSentence(){
		if(printer==null){
			System.out.println(buffer.toString());
		}else{
			printer.print(buffer.toString());
		}
	}
	
	
	
}
