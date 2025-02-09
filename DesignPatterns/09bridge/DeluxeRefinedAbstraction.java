package bridge;

public class DeluxeRefinedAbstraction extends PrinterAbstraction {

	@Override
	protected void loadPrinters() {
		printers.add(new ConcreteLowerPrinterImplementor());
		printers.add(new ConcreteUpperPrinterImplementor());	
		printers.add(new ConcreteReversePrinterImplementor());	
		printers.add(new ConcreteTabbedPrinterImplementor());	
	}

}
