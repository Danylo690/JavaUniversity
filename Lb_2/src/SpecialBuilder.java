import java.util.*;

public class SpecialBuilder implements CarBuilder{
	
	private final Car car = new Car();
	
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void buildName() {
		car.setName("M5");
	}

	@Override
	public void buildBrand() {
		car.setBrand("BMW");
	}

	@Override
	public void buildSerialNumber() {
		System.out.print("Enter your serial number: ");
		car.setSerialNumber(sc.next());
	}

	@Override
	public void buildPrice() {
		car.setPrice(290000);
	}

	@Override
	public void buildEngine() {
		System.out.print("Enter your engine: ");
		car.setEngine(sc.next());
	}

	@Override
	public void buildChassis() {
		System.out.print("Enter your chassis: ");
		car.setChassis(sc.next());
	}

	@Override
	public void buildCarBody() {
		System.out.print("Enter your car body: ");
		car.setCarBody(sc.next());
	}
	
	@Override
	public Car getCar() {
		return car;
	}
}
