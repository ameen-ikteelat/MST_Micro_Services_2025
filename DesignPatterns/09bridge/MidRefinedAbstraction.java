package bridge;

public class MidRefinedAbstraction extends PrinterAbstraction {


	@Override
	protected void loadPrinters() {
		printers.add(new ConcreteReversePrinterImplementor());
		printers.add(new ConcreteTabbedPrinterImplementor());	
	}

}
