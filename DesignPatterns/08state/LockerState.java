package state;

public abstract class LockerState {
	public abstract void handleLock(LockerContext locker);
	public abstract void handleOpen(LockerContext locker);
}
