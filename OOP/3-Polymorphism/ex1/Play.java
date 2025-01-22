package cards;

public class Play {

	public static void main(String[] args) {
		Card cards[]=new Card[3];
		cards[0]=new Card();
		cards[1]=new BlueCard();
		cards[2]=new GreenCard();
	
		int cardCounter=0,blueCounter=0,greenCounter=0;
		
		int player1=100,player2=100;
		for(int i=0;i<5;i++){
			//player1:
			int cardIndex=(int)(Math.random()*3);
			player1=cards[cardIndex].doMagic(player1);
			if(cards[cardIndex] instanceof GreenCard){
				greenCounter++;
			}else if(cards[cardIndex] instanceof BlueCard){
				blueCounter++;
			}else{
				cardCounter++;
			}
			//player2:
			cardIndex=(int)(Math.random()*3);
			player2=cards[cardIndex].doMagic(player2);
			if(cards[cardIndex] instanceof GreenCard){
				greenCounter++;
			}else if(cards[cardIndex] instanceof BlueCard){
				blueCounter++;
			}else{
				cardCounter++;
			}
		}
		System.out.println("Player 1: "+player1);
		System.out.println("Player 2: "+player2);
		System.out.println("Card: "+cardCounter);
		System.out.println("Blue: "+blueCounter);
		System.out.println("Green: "+greenCounter);
	}

}
