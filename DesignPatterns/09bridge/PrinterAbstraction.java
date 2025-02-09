package bridge;

import java.util.ArrayList;

public abstract class PrinterAbstraction {
	
	protected ArrayList<PrinterImplementor> printers=new ArrayList<PrinterImplementor>();
	
	public PrinterAbstraction(){
		loadPrinters();
	}
	
	public void printInAllFormats(String text){
		for(PrinterImplementor printer:printers)
			printer.print(text);
	}
	
	protected abstract void loadPrinters();
}
