// enter two numbers by using command line argument then add, subtract, multiple, division and modulus between these two numbers

public class Calculate {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int add = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;

		System.out.println("Addition = " + add);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mult);
		System.out.println("Division = " + div);
		System.out.println("Modulus = " + mod);
	}
}