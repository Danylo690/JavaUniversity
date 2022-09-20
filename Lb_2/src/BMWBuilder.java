public class BMWBuilder implements CarBuilder {
	
	private final Car car = new Car();
	
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
		car.setSerialNumber("DLIM1321329");
	}

	@Override
	public void buildPrice() {
		car.setPrice(250000);
	}

	@Override
	public void buildEngine() {
		car.setEngine("Sample engine 1");
	}

	@Override
	public void buildChassis() {
		car.setChassis("Sample chassis 1");
	}

	@Override
	public void buildCarBody() {
		car.setCarBody("Sample car body 1");
	}

	@Override
	public Car getCar() {
		return car;
	}
}
