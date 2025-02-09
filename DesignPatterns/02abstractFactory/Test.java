package abstractFactory;

public class Test {

	public static void main(String[] args){
		try{
			FormatFactory factory=(FormatFactory)Class.forName(args[0]).newInstance();
			
			Editor editor=factory.getEditor();
			Validator validator=factory.getValidator();
			Printer priner=factory.getPrinter();
			
			editor.edit();
			validator.validate();
			priner.print();
			
		}catch(Exception e){
			System.out.println("factory not found");
		}
	}

}
