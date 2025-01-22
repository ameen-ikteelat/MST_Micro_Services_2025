package core;

public class Run {

	public static void main(String[] args) {
		Vehicle[]v=new Vehicle[2];
		v[0]=new Car(12,44,4);
		v[1]=new Airplane(12,44);
		
		for(int i=0;i<v.length;i++){
			v[i].go();
		}

	}

}
