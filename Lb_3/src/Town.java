public class Town implements JurisdictionUnit{
	private String Name;
	private double Area;
	private double Population;

	public Town(String name, double area, double population) {
		this.Name = name;
		this.Area = area;
		this.Population = population;
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
	
	@Override
	public void printDeatilInformation(){
		System.out.print(this.toString());;
	}
	@Override
	public String toString(){
		return "\t\tName: " + Name + "\n"
				+ "\t\tArea: " + Area + "\n"
				+ "\t\tPopulation: " + Population + "\n"
				+ "\t\t***************************" + "\n";
	}
}
