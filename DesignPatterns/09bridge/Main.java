package bridge;

public class Main {

	public static void main(String[] args) {

		PrinterAbstraction a=new RegularRefinedAbstraction();
		PrinterAbstraction b=new DeluxeRefinedAbstraction();
		PrinterAbstraction c=new MidRefinedAbstraction();
		
		a.printInAllFormats("Regular");
		
		System.out.println();
		
		b.printInAllFormats("Delux");
		
		System.out.println();
		
		c.printInAllFormats("Mid");

	}

}
