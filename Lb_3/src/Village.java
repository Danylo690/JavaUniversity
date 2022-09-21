public class Village implements JurisdictionUnit{
	private String Name;
	private double Area;
	private double Population;
	private boolean HasSchool;

	public Village(String name, double area, double population, boolean hasSchool) {
		super();
		this.Name = name;
		this.Area = area;
		this.Population = population;
		this.HasSchool = hasSchool;
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
	public boolean getHasSchool() {
		return HasSchool;
	}
	public void setHasSchool(boolean hasSchool) {
		this.HasSchool = hasSchool;
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
				+ "\t\tHas school: " + HasSchool + "\n"
				+ "\t\t***************************" + "\n";
	}
}
