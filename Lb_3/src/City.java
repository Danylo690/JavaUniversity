public class City implements JurisdictionUnit{
	private String Name;
	private double Area;
	private double Population;
	private boolean IsHeadCity;
	
	public City(String name, double area, double population, boolean isHeadCity) {
		this.Name = name;
		this.Area = area;
		this.Population = population;
		this.IsHeadCity = isHeadCity;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		this.Area = area;
	}
	public double getPopulation() {
		return Population;
	}
	public void setPopulation(double population) {
		this.Population = population;
	}
	public boolean isIsHeadCity() {
		return IsHeadCity;
	}
	public void setIsHeadCity(boolean isHeadCity) {
		this.IsHeadCity = isHeadCity;
	}
	
	@Override
	public void printDeatilInformation(){
		System.out.print(this.toString());;
	}
	@Override
	public String toString(){
		return "\t\tName: " + Name + "\n"
				+ "\t\tArea: " + Area + "\n"
				+ "\t\tPopulation: " + Population + "\n"
				+ "\t\tIs head city: " + IsHeadCity + "\n"
				+ "\t\t***************************" + "\n";
	}
}
