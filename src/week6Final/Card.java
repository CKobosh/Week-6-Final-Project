package week6Final;

public class Card {

//Fields
private int value; 
private String name; 

//Describe card
public void describe() { 
if (value == 11) {	
	System.out.println("Jack of " + name); }
else if (value == 12) {
	System.out.println("Queen of " + name); }
else if (value == 13) {
		System.out.println("King of " + name); }
else if (value == 14) {
		System.out.println("Ace of " + name); }
else {
	System.out.println(value + " of " +  name); 
	}
}
//Getters and Setters
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}	
}