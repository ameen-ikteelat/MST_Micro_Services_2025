package mediator;

public class Airport {
	
	private boolean []runways={true,true,true};
	
	public  synchronized boolean permissionToLand(){
		for(int i=0;i<runways.length;i++){
			if(runways[i]){
				runways[i]=false;  //occupied
				new Thread(new RunwayCleaner(i)).start();
				System.out.println("Land on runway "+(i+1));
				return true;
			}
		}
		System.out.println("No available runway, Try again in 10 seconds");
		return false;
	}
	
	public synchronized boolean permissionToTakeOff(){
		for(int i=0;i<runways.length;i++){
			if(runways[i]){
				runways[i]=false;  //occupied
				new Thread(new RunwayCleaner(i)).start();
				System.out.println("You may takeoff from runway "+(i+1));
				return true;
			}
		}
		System.out.println("No available runway, Try again in 10 seconds");
		return false;
	}
	
	class RunwayCleaner implements Runnable{
		private int runwayNumber;
		
		public RunwayCleaner(int runwayNumber){
			this.runwayNumber=runwayNumber;
		}
		public void run() {
			try{Thread.sleep(10000);}catch(Exception e){}
			runways[runwayNumber]=true;
		}
		
	}
}
