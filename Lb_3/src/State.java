import java.util.*;

public class State implements JurisdictionUnit{	
	private String Name;
	private double Area;
	private String Industry;
	private String Transport;
	private String Nationalities;
	private String OfficialLanguage;
	private ArrayList<JurisdictionUnit> Settlements = new ArrayList<JurisdictionUnit>();
	
	public State(String name, double area, String industry, String transport, String nationalities,
			String officialLanguage) {
		this.Name = name;
		this.Area = area;
		this.Industry = industry;
		this.Transport = transport;
		this.Nationalities = nationalities;
		this.OfficialLanguage = officialLanguage;
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
	public String getIndustry() {
		return Industry;
	}
	public void setIndustry(String industry) {
		this.Industry = industry;
	}
	public String getTransport() {
		return Transport;
	}
	public void setTransport(String transport) {
		this.Transport = transport;
	}
	public String getNationalities() {
		return Nationalities;
	}
	public void setNationalities(String nationalities) {
		this.Nationalities = nationalities;
	}
	public String getOfficialLanguage() {
		return OfficialLanguage;
	}
	public void setOfficialLanguage(String officialLanguage) {
		this.OfficialLanguage = officialLanguage;
	}
	public ArrayList<JurisdictionUnit> getSettlements() {
		return Settlements;
	}
	public void setSettlements(ArrayList<JurisdictionUnit> settlements) {
		this.Settlements = settlements;
	}
	
	public void addSettlements(JurisdictionUnit settlement){
		if (!Settlements.contains(settlement)){
			Settlements.add(settlement);
			 }
	}
	public void removeSettlements(JurisdictionUnit settlement){
		Settlements.remove(settlement);
	}
	
	@Override
	public void printDeatilInformation() {
		System.out.print(this.toString());
		Settlements.stream().forEach((n) -> n.printDeatilInformation());
	}
	@Override
	public String toString()
	{
		return "\tName: " + Name + "\n"
				+ "\tArea: " + Area + "\n"
				+ "\tIndustry: " + Industry + "\n"
				+ "\tTransport: " + Transport + "\n"
				+ "\tNationalities: " + Nationalities + "\n"
				+ "\tOfficial language: " + OfficialLanguage + "\n"
				+ "\t***************************" + "\n";
	}

}
