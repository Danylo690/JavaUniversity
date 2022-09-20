public class Runner {
	
	public static void main(String args[])
	{
		Car car1 = Director.createCar(new BMWBuilder());
		System.out.print(car1.toString());
		
		Car car2 = Director.createCar(new SpecialBuilder());
		System.out.print(car2.toString());
	}
}
