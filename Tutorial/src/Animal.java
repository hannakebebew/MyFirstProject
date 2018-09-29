
public class Animal {

	String walk;
	double height;
}
			
class dog extends Animal {
	String bark;
	String color;	
}
		
	class cat extends dog{
		String eat;
		double age;
		
		public void bark () {
			System.out.println("meaw meaw");
		}
		
	}
	class cow extends Animal{
		double weight;
		String name;
	
		
		public static void main(String [] args) 
		{
			System.out.println("Cow ... mow mow");
		
		
		Animal obj1 = new Animal();
		dog obj2 = new dog();
		cat obj3 = new cat();
		cow obj4 = new cow ();
		
		obj1.walk= "fast";
		obj1.height= 15.3;
		
		obj3.bark= "loud"; 
		obj3.color= "black";
		obj3.eat= "meat";
		obj3.age = 3;
		obj4.weight= 4.9;
		obj4.name = "Noel"; 
		
		
		
	System.out.println("Cow Values are loading" +  obj2.bark+ obj2.color+ obj1.walk + obj1.height);
	
	System.out.println("Dog values are  loading  "+ obj4.name + obj4.weight);
	System.out.println("Cat values are loading  "+ obj3.age + obj3.eat );

	}
}