import java.util.*;

public class Country implements JurisdictionUnit{
	private String Name;
	private ArrayList<JurisdictionUnit> States = new ArrayList<JurisdictionUnit>();
	
	public Country(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public ArrayList<JurisdictionUnit> getStates() {
		return States;
	}
	public void setStates(ArrayList<JurisdictionUnit> states) {
		this.States = states;
	}
	
	public void addState(JurisdictionUnit state){
		if (!States.contains(state)){
			States.add(state);
			 }
	}	
	public void removeState(JurisdictionUnit state){
		States.remove(state);
	}
	
	@Override
	public void printDeatilInformation() {
		System.out.print(this.toString());
		States.stream().forEach((n) -> n.printDeatilInformation());
	}
	@Override
	public String toString() {
		return "Name: " + Name + "\n"
				+ "***************************" + "\n";
	}

}
