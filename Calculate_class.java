// enter two numbers by using command line argument then add, subtract, multiple, division and modulus between these two numbers

class Calculate
{
	public static void main(String[] args)
	{
		int result;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		result = add(num1, num2);
		System.out.println(" " +result);
        	//sub(num1, num2);
        	//mul(num1, num2);
        	//div(num1, num2);

	}
	
	public static int add(int a,int b)
	{
		int add = a + b;
		
        	return add;

	}
}