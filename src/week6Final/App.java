package week6Final;

public class App {
//Additional print lines and .describe methods commented out, but available for further details of game
	public static void main(String[] args) {
//Instantiate Deck and two Players
		Player player1 = new Player(); 
		player1.setName("Player1");
		Player player2 = new Player(); 
		player2.setName("Player2");

		Deck deck = new Deck(); 
			for (Card card: deck.cards) {
			deck.shuffle(); 
			}
//Use for loop to iterate through deck 52 times, each player drawing every other time			
 for (int i = 0; i < 52; i++) {
	 if (i % 2 == 0) {
		 player1.draw(deck);
	 }
	 else {
		 player2.draw(deck);
	 }
 }
 //Use for loop to iterate 26 times and call flip method for each player
 for (int i = 0; i < 26; i++) {
	 Card card1 = player1.flip(); 
	 //player1.describe(); 
	 //card1.describe(); 
	 
	 Card card2 = player2.flip();
	 //player2.describe(); 
	 //card2.describe(); 
	 
//Compare value of each card returns and implement incrementScore method	 
	 if (card1.getValue() > card2.getValue()) {
		 player1.incrementScore(); 
		 //		 System.out.println("Player1 wins this round with a new scores of: " + player1.getScore() + "\n");
	 }
	 else if (card1.getValue() < card2.getValue()) {
		 player2.incrementScore(); 
		 //		 System.out.println("Player2 wins this round with a new score of: " + player2.getScore() + "\n");
	 }
	 else {
		 //		System.out.println("The players have tied." + "\n"); 
	 }
 }	
 //Compare and print final score
  if (player1.getScore() > player2.getScore()) {
	  System.out.println("Player1 scored " + player1.getScore() + " points. Player2 scored " + player2.getScore()  + " points." + "\n Congratulations Player1!");
  }
  else if (player1.getScore() < player2.getScore()) {
	  System.out.println("Player1 scored " + player1.getScore() + " points. Player2 scored " + player2.getScore() + " points." + "\n Way to go Player2!");
  }
  else {
	  System.out.println("Player1 scored " + player1.getScore() + " points.  Player2 scored " + player2.getScore() + " points." + "\n The players tied.  It's a draw.");
  }
  
	}
}





