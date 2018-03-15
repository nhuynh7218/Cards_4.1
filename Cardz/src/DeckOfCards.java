
import java.util.ArrayList;
public class DeckOfCards {
	public static ArrayList<Card>unDealt = new ArrayList<Card>();
	public static ArrayList<Card>dealt =  new ArrayList<Card>();
	
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
	
	public Card deal()
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
	
	public void shuffle()
	{
		for(int k = 51; k >= 0; k--)
		{
			
		}
	}
}

