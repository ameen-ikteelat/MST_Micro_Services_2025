package di.dataMember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("EngineBean")
public class Engine {
	@Value("1.6T")
	private String capacity;
	@Value("100")
	private int numOfCylinder;



	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getNumOfCylinder() {
		return numOfCylinder;
	}
	public void setNumOfCylinder(int numOfCylinder) {
		this.numOfCylinder = numOfCylinder;
	}


	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", numOfCylinder=" + numOfCylinder + "]";
	}



}
