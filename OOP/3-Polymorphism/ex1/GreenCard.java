package cards;

public class GreenCard extends Card {
	@Override
	public int doMagic(int value){
		return value/2;
	}
}
