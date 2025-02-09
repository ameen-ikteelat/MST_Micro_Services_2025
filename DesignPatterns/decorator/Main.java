package decorator;

public class Main {

	public static void main(String[] args) {
		String s1="hello!!!";
		String s2="java design patterns";
		
		ConcreteStringPrinter printer1=new ConcreteStringPrinter();
		printer1.print(s1);
		
		TabbedStringPrinter printer2=new TabbedStringPrinter(printer1);
		printer2.print(s1);
		
		CapitalizeStringPrinter printer3=new CapitalizeStringPrinter(printer1);
		printer3.print(s2);
		
		CapitalizeStringPrinter printer4=new CapitalizeStringPrinter(printer2);
		printer4.print(s2);
		

	}

}
