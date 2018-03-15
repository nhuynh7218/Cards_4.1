
import java.util.ArrayList;
public class DeckOfCards {
	ArrayList<Cards>unDealt;
	ArrayList<Cards>dealt;
	
	public DeckOfCards(String [] rank, String [] suit, int [] pointValue)
	{
		for(int i = 0; i < rank.length; i++)
		{
			for(int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Cards(rank[i], suit[j], pointValue[i]));
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
	
	public Cards deal()
	{
		if(unDealt.size() > 0)
		{
			return unDealt(0);
			
		}
		return null;
	}
	
	public void shuffle()
	{
		for(int k = 51; k >= 0; k--)
		{
			
		}
	}
}

