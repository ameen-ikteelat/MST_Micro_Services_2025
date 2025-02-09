package adapter;

import java.util.ArrayList;

public class StackAdaptee  {
	
	private ArrayList<Character> chars=new ArrayList<Character>();
	
	public void addElement(char ch) {
		chars.add(Character.toLowerCase(ch));
	}
	
	public void print(){
		System.out.println(chars);
	}

}
