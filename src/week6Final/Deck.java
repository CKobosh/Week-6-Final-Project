package week6Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//Fields	
	List<Card> cards = new ArrayList<Card>(); 
		
public Deck () {
//Creating the deck	
	List<Integer> value = new ArrayList<Integer>(); 
	
	for (int i = 2; i <= 14; i++) {
		value.add(i); 
	}
		
	String[] name = new String[4]; 
	
	name[0] = "Spades";
	name[1] = "Diamonds";
	name[2] = "Hearts";
	name[3] = "Clubs";

	for (int i = 0; i <= 3; i++) {
		for (int v = 2; v <= 14; v++) {
			
			Card card = new Card(); 
			card.setName(name[i]); 
			card.setValue(v);
			cards.add(card); 
		}
	}	
	}
//Shuffle: randomizes order of cards
	public void shuffle() {
	Collections.shuffle(cards);
}
//Draw: removes and returns top card of the deck	
	public Card draw() {
		return cards.remove(0); 
	}
}