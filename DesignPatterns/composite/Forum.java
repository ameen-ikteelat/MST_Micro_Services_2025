package composite;

import java.util.ArrayList;

public class Forum extends Entity{

	private ArrayList<Entity> members=new ArrayList<Entity>();
	
	public void addMember(Entity entity){
		members.add(entity);
	}
	
	public void removeMember(Entity entity){
		members.remove(entity);
	}
	
	@Override
	public void introduceYourself() {
		for(Entity entity:members){
			entity.introduceYourself();
		}
	}

}
