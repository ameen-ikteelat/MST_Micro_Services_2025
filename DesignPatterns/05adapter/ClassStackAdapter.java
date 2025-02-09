package adapter;

public class ClassStackAdapter extends StackAdaptee implements Stack {
	public void add(char ch){
		super.addElement(ch);
	}

	public void printStack() {
		super.print();
	}
}
