package week6Final;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
//Fields
private List<Card> hand = new ArrayList<Card>(); 	
private int score; 	
private String name; 
		
//Getters and Setters
public List<Card> getHand() {
	return hand;
}
public void setHand(List<Card> hand) {
	this.hand = hand;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//Describe player
public void describe() {
	System.out.println(name + " plays: ");
}
//Add 1 to score for winning card
public void incrementScore() {
	this.score++; 
}
//Remove and return top card
public Card flip() {
	return hand.remove(0); 
}
//Take deck as argument, return drawn card
public void draw(Deck deck) {
	hand.add(deck.draw());
	
}
}