package mediator;

public class Main {

	public static void main(String[] args) {
		Airport airport=new Airport();
		
		boolean [] planeState = {true,false,false,true,true,true,false,true,false,false,true,false,false,false,true,true};
		Airplane[] planes=new Airplane[16];
		for(int i=0;i<16;i++){
			planes[i]= new Airplane(airport,i+1,planeState[i]);
			new Thread(planes[i]).start();
		}
	}
}
