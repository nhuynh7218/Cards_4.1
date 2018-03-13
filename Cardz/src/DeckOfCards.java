
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
}
