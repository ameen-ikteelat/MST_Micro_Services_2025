package factory;

public class Test {

	public static void main(String[] args){
		try{
			EditorFactory factory=(EditorFactory)Class.forName(args[0]).newInstance();
			
			Editor editor=factory.createEditor();
			editor.edit();
			Validator validator=editor.createValidator();
			validator.validate();
			Printer priner=validator.createPrinter();
			priner.print();
			
		}catch(Exception e){
			System.out.println("factory not found");
		}
	}

}
