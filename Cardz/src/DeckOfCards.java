
import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
	public static ArrayList<Card>unDealt = new ArrayList<Card>();
	public static ArrayList<Card>dealt =  new ArrayList<Card>();
	
	public static ArrayList<Card> getUnDealt() {
		return unDealt;
	}

	public static void setUnDealt(ArrayList<Card> unDealt) {
		DeckOfCards.unDealt = unDealt;
	}

	public static ArrayList<Card> getDealt() {
		return dealt;
	}

	public static void setDealt(ArrayList<Card> dealt) {
		DeckOfCards.dealt = dealt;
	}

	public DeckOfCards(String [] rank, String [] suit, int [] pointValue)
	{
		for(int i = 0; i < rank.length; i++)
		{
			for(int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[j], pointValue[i]));
			}
		}
	}
	//checks to see if the deck is empty
	public boolean isEmpty()
	{
		if(unDealt.size()==0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return (unDealt.size());
	}
	
	public static Card deal()
	{
		if(unDealt.size() == 0)
		{
			return null;
		}
		Card inHand = unDealt.get(0);
		dealt.add(inHand);
		unDealt.remove(0);
		return inHand;
		
	}
	
	public static void shuffle()
	{
		unDealt.addAll(getDealt());
		
		for (int k = 1; k < 52; k++)
		{
			int r = (int)(Math.random()*k);
			Card temp = unDealt.get(r);
			unDealt.set(r, unDealt.get(k));
			unDealt.set(k, temp);
		}
	}
}


