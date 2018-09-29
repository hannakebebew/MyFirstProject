import java.util.Scanner;

public class Practise extends PracticeOne {
	
	
	public static void main (String [] args) {
		
		PracticeOne math = new Practise();
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the first number");
		int a = scan.nextInt();
		System.out.println("Please enter the second number");
		int b= scan.nextInt();
		System.out.println("enter 1 for add, 2 for sub, 3 for mul, 4 for div");
		int c = scan.nextInt();
		
		
		
		switch (c) {
		case 1: math.addition(a, b);
				break;
		case 2: math.substruction(a, b);
				break;
		case 3: math.multiplication(a, b);
				break;
		case 4: math.division(a, b);
				break;
		default: math.disp();;
		}
	}
}

