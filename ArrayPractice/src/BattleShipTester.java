
public class BattleShipTester {

	public static void main(String[] args) 
	{
		BattleShip game1 = new BattleShip();
		game1.printGrid();
		
		game1.placeFishingBoat(0,0);
		game1.placeCarrierBoat(6, 5, "Vertical");
		game1.printGrid();
	}

}
