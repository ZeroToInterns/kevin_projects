
public class Car extends Vehicle {
	public static void main(String[] args)
	{
		//Creating a new car named myCar from the Car Class 
		Car myCar = new Car();
		//using the move function from myCar's superclass called Vehicle
		myCar.move();
		
	}
	
	@Override
	public void move() {
		System.out.println("The Car has move 10 feet");
	}
	
	public void drive()
	{
		System.out.println("The Car has moved 5 feet");
	}

}
