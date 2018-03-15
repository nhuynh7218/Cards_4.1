
public class Card {
	//fields
	String rank;
	String suit;
	int pointValue;
	
	//Constructor
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	//getters and setters for the fields
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card original, Card comparing)
	{
		if (original.getPointValue() == comparing.getPointValue())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return("Card: "+ rank + suit + "value: "+ pointValue);
	}
}
