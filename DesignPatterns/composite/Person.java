package composite;

public class Person extends Entity{
	
	private String name;
	
	public Person(String name){
		this.name=name;
	}
	
	@Override
	public void introduceYourself(){
		System.out.println("Hi !  I'm "+name);
	}

}
