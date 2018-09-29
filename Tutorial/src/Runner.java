import java.util.Scanner;

public class Runner {

	// 1. Arithmetic Operation
	
	int num=100;
	int num1=50;
	
	
	public static void main (String[] args) {
		
		Runner a = new Runner ();
		
		System.out.println("Num+Num1 = " + (a.num+a.num1));
		System.out.println("Num%Num1 = " + (a.num%a.num1));
		System.out.println("Num*Num1 = " + (a.num*a.num1));
		System.out.println("Num/Num1 = " + (a.num/a.num1));
		System.out.println("Num-Num1 = " + (a.num-a.num1));
		
// 2. Assignment Operation
		
		 a.num=a.num1;
		System.out.println("= Output: "+ (a.num=a.num1));
		a.num+=a.num1;
		System.out.println("=Output: " + (a.num+=a.num1));
		a.num*=a.num1;
		System.out.println("=Output: " +(a.num*=a.num1));
		a.num/=a.num1;
		System.out.println("=Output: " + (a.num>=a.num1));
		
	//switch
		
		Scanner month = new Scanner (System.in);
		System.out.println("Enter number of the month");
		int x = month.nextInt();
		
		switch (x) {
		case 1:
		{
			System.out.println(x + " is the month of January");
		}
		case 2:
		{
			System.out.println(x + " is the month of February");
		}
		case 3:
		{
			System.out.println(x + "is the month of March");
			month.close();
		}
		}
		
			
	}
		
	}

