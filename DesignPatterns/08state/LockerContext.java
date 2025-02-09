package state;

public class LockerContext {
	
	private LockerState state=null;
	private int combination; 
	
	public LockerContext(LockerState state,int combination){
		this.state=state;
		this.combination=combination;
	}
	
	public void lock(){  //uses exisiting combination
		state.handleLock(this);
	}
	
	public void lock(int combination){
		this.combination=combination;
		lock();
	}
	
	public void open(int combination){
		if(this.combination==combination){
			state.handleOpen(this);
		}else{
			System.out.println("WRONG CODE");
		}
	}

	public LockerState getState() {
		return state;
	}

	public void setState(LockerState state) {
		this.state = state;
	}
	
	

}
