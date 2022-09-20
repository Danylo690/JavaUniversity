public class Director {
	public static Car createCar(CarBuilder builder){
		builder.buildName();
		builder.buildBrand();
		builder.buildSerialNumber();
		builder.buildPrice();
		builder.buildEngine();
		builder.buildChassis();
		builder.buildCarBody();
		return builder.getCar();
	}
}
