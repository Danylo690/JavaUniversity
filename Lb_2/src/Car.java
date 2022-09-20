public class Car {
	private String Name;
	private String Brand;
	private String SerialNumber;
	private double Price;
	private String Engine;
	private String Chassis;
	private String CarBody;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getChassis() {
		return Chassis;
	}
	public void setChassis(String chassis) {
		Chassis = chassis;
	}
	public String getCarBody() {
		return CarBody;
	}
	public void setCarBody(String carBody) {
		CarBody = carBody;
	}
	@Override
	public String toString(){
		String result = "Name: " + Name + "\n"
				+ "Brand: " + Brand + "\n"
				+ "Serial number: " + SerialNumber + "\n"
				+ "Price: " + Price + "\n"
				+ "Engine: " + Engine + "\n"
				+ "Chassis: " + Chassis + "\n"
				+ "Car body: " + CarBody + "\n"
				+ "****************************" + "\n";
		return result;
	}
}