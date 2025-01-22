package core;

public class Airplane extends Vehicle {

	
	public Airplane(int model, int speed){
		super(model,speed);
		
	}
	
	@Override
	public void go() {
		System.out.println("flying in an airplane");
	}

}
