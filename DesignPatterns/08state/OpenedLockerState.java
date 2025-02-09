package state;

public class OpenedLockerState extends LockerState {

	@Override
	public void handleLock(LockerContext locker) {
		locker.setState(new LockedLockerState());
		System.out.println("Locker is now close");
	}

	@Override
	public void handleOpen(LockerContext locker) {
		System.out.println("ERROR: Already opened");
	}

}
