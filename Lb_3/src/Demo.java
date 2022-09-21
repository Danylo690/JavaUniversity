public class Demo {
	public static void main(String args[]) {
		City city1 = new City("Харків", 350, 1.5, true);
		City city2 = new City("Куп'янськ", 33.34, 0.275, false);
		
		State state1 = new State("Харківська область", 31415, 
				"Індустрія 1", "Транспорт 1", "Люди 1", "Українська");
		state1.addSettlements(city1);
		state1.addSettlements(city2);
		
		Town town1 = new Town("Слов'янськ", 69, 0.111);
		Village village1 = new Village("Бахмутське", 2.9, 0.000784, true);
		
		State state2 = new State("Донецька область", 26517, 
				"Індустрія 2", "Транспорт 2", "Люди 2", "Українська");
		state2.addSettlements(town1);
		state2.addSettlements(village1);
		
		Country country1 = new Country("Україна");
		country1.addState(state1);
		country1.addState(state2);
		
		country1.printDeatilInformation();
	}
}
