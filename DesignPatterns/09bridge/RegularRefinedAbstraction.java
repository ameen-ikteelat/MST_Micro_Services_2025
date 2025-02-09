package bridge;

public class RegularRefinedAbstraction extends PrinterAbstraction {


	@Override
	protected void loadPrinters() {
		printers.add(new ConcreteLowerPrinterImplementor());
		printers.add(new ConcreteUpperPrinterImplementor());	
	}

}
