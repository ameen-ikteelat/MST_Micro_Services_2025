package di.dataMember;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("TransmissionBean")
public class Transmission {
	@Value("Hundai")
	private String type;



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transmission [type=" + type + "]";
	}




}
