public class Enterprise {
	
	private String Name;
	
	private int PhoneNumber;
	
	public Enterprise(String name, int phoneNumber)
	{
		Name = name;
		PhoneNumber = phoneNumber;
	}
	
	public String GetName()
	{
		return Name;
	}
	
	public int GetPhoneNumber()
	{
		return PhoneNumber;
	}
}