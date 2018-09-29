import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculation cal = new Calculation();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int x = scan.nextInt();
		System.out.println("Enter second number");
		int y = scan.nextInt();
		System.out.println("Please Enter 1 to ADD, 2 to Subtract, 3 to Multiply, 4 to Divide ");
		int z = scan.nextInt();

		if (z == 1) {

			cal.additon(x, y);

		}

		if (z == 2) {

			cal.subtract(x, y);

		}
		if (z == 3) {

			cal.multiply(x, y);

		}
		if (z == 4) {

			cal.divide(x, y);

		}

		scan.close();

	}

}

class Calculation {

	public int additon(int a, int b) {

		int add = a + b;
		System.out.println("The sum is: " + add);
		return add;

	}

	public int subtract(int a, int b) {
		int sub = a - b;

		System.out.println("The subtraction is: " + sub);
		return sub;
	}

	public int divide(int a, int b) {
		int div = a / b;

		System.out.println("The divide is: " + div);
		return div;
	}

	public int multiply(int a, int b) {
		int mul = a * b;
		System.out.println("The multiply is: " + mul);
		return mul;

	}

}
