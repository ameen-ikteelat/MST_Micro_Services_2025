package di.dataMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CarBean")
public class Car {
	
	@Autowired
	private Engine engine;
	@Autowired
	private Transmission transmission;
	
	

	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Transmission getTransmission() {
		return transmission;
	}
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}



	@Override
	public String toString() {
		System.out.println("Car [engine=" + engine + ", transmission=" + transmission + "]");
		return "Car [engine=" + engine + ", transmission=" + transmission + "]";
	}
	
	
	
}
