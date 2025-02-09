package composite;

public class Main {

	public static void main(String[] args) {
		Forum f=new Forum();
		f.addMember(new Person("David"));
		f.addMember(new Person("Dana"));
		f.addMember(new Person("Eve"));
		f.addMember(new Person("Adam"));
		
		Forum subForum=new Forum();
		subForum.addMember(new Person("Sam"));
		subForum.addMember(new Person("Christin"));
		f.addMember(subForum);
		
		f.introduceYourself();
	}

}
