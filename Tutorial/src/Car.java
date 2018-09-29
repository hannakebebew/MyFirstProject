import java.util.Scanner;

public class Car {
	
	String type;
	String color;
	String model;
	int price;
	
	public Car (String type, String color, String model, int price) {
		this.type=type;
		this.color=color;
		this.model=model;
		this.price=price;
		
	}
	
	public void sales () {
		System.out.println(type + " comes in "+color+ " for " +model+" with a price of "+ price);
		
	}
	
	public void descrip () {
		System.out.println(type + " is a fast and strong car in north america");
		
	}
	
	public void avail () {
		System.out.println(type + " is available in Africa, Asia and Europe");
		
	}
	
	public static void main (String [] args) {
		System.out.println("Please check types and price of cars that are on sale");
		
		Car rangeR=new Car("RangeRover", "Yellow", "XY", 1234);
		rangeR.descrip();
		rangeR.avail();
		
		Car Audi= new Car ("Audi", "Black", "GY", 234);
				Audi.descrip();
				rangeR.avail();
		
		
	}
	
}