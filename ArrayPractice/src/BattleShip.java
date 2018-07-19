public class BattleShip 
{
	private boolean[][] board;
	
	public BattleShip ()
	{
		board = new boolean[10][10];
	}
	
	//places a 1 unit fishing boat at a location
	public void placeFishingBoat(int x, int y)
	{
		board[x][y] = true;
			
	}
	
	public void printGrid()
	{
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	//places a 3 unit long boat on the grid starting form x and y
	public void placeCarrierBoat(int x, int y, String orientation)
	{
		try
		{
			if(orientation.equalsIgnoreCase("Horizontal"))
			{
				for(int i = 0; i < 3; i++)
				{
					board[y + i][x] = true;
				}
			}
			else if(orientation.equalsIgnoreCase("Vertical"))
			{
				for(int i = 0; i < 3; i++)
				{
					board[y][x+i] = true;
				}
			}
			else
			{
				System.out.println("Please put in a valid oorientaiton!");
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Cannot place boat at that spot");
		}
	}
	
	public void attack(int x, int y)
	{
		if(board[y][x])
		{
			System.out.println("Hit!");
		}
		else 
		{
			System.out.println("Missed!");
		}	
	}
}