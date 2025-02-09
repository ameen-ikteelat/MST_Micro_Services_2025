package adapter;

public class Main {

	public static void main(String[] args) {
		//StackAdaptee s1=new StackAdaptee();
		Stack s2=new ObjectStackAdapter();
		Stack s3=new ClassStackAdapter();
		
		//s1.addElement('A');
		s2.add('A');
		s3.add('A');
		
		//s1.addElement('b');
		s2.add('b');
		s3.add('b');
		
		//s1.addElement('C');
		s2.add('C');
		s3.add('C');
		
		//s1.print();
		s2.printStack();
		s3.printStack();

	}

}
