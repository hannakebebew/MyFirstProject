
public class Employee {
	
	String Name;
	String Title;
	int exp;
	String special;
	String restaurant; 
	
	public Employee (String Name, String Title, int exp, String special, String restaurant) {
		this.Name=Name;
		this.Title=Title;
		this.exp=exp;
		this.special=special;
		this.restaurant=restaurant; 
		
	}
	
	public void intro () {
		System.out.println("My name is "+ Name + " and I am "+ Title + " with experiance " + exp );
		
	}
	
	public void takeOrder () {
		System.out.println ("Today specail is "+ special);
	}
	
	public void appreciate () {
		System.out.print("Thanks for coming to "+ restaurant+ " in VA");
	}

	public static void main (String [] args) {
		
		System.out.println("Welcome to Bagel World");
		
		Employee emp1 = new Employee ("Hanna", "server", 5, "Mar&cheese", "Italian");
		emp1.intro();
		emp1.takeOrder();
		emp1.appreciate();
		
		Employee emp2 = new Employee ("Sara", "Manager", 10, "cheese cake", "Ramada ");
				emp2.intro();
				emp2.takeOrder();
				emp2.appreciate();
		
		
		
	}
}
