import java.util.*;

public class Demo {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		DirectoryOfEnterprises directory = new DirectoryOfEnterprises();
		//Вывод главного меню
		while(true)
		{
			System.out.println("---------------------------------");
			System.out.println("1.Add enterprise;"
					+ "\n2.Display all enterprises;"
					+ "\n3.Determine the difference between the maximum and minimum values;"
					+ "\n4.Sort in descending order of phone numbers;"
					+ "\n5.Display data on odd values of phone numbers greater than input's value;"
					+ "\n6.Display data on even values of phone numbers greater than input's value;"
					+ "\n7.Exit.");
			System.out.print("Select menu item: ");
			int menu = sc.nextInt();
			System.out.println("---------------------------------");
			switch (menu)
			{
				case 1:
				{
					System.out.print("Enter the name: ");
					String name = sc.next();
					System.out.print("Enter the phone number: ");
					int phoneNumber = sc.nextInt();
					directory.AddEnterprise(name, phoneNumber);
					break;
				}
				case 2:
				{
					directory.PrintAllEnterprises();
					break;
				}
				case 3:
				{
					directory.Difference();
					break;
				}
				case 4:
				{
					directory.SortList();
					break;
				}
				case 5:
				{
					System.out.print("Enter the phone number: ");
					int phoneNumber = sc.nextInt();
					directory.OddValue(phoneNumber);
					break;
				}
				case 6:
				{
					System.out.print("Enter the phone number: ");
					int phoneNumber = sc.nextInt();
					directory.EvenValue(phoneNumber);
					break;
				}
				case 7:
				{
					sc.close();
					return;
				}
			}
		}
	}
}
