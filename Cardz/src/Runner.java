
public class Runner {
	
	public static void main(String[]args)
	{
		String [] rank = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String [] suit = {" of diamond", " of clubs", " of hearts", " of spades"};
		int [] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
		DeckOfCards unDealt = new DeckOfCards(rank,suit,pointValue);
		
		
		
		while (unDealt.size() > 0)
		{
			
			System.out.println(DeckOfCards.deal());
			
		}
	}
}
