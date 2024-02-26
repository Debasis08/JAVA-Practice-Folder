// write a java program, enter two short numbers by using command line argument and swap between them

class SwapNumbers
{
	public static void main(String[] args)
	{
		short num1 = Short.parseShort(args[0]);
		short num2 = Short.parseShort(args[1]);
		

		System.out.println("Before Swapping num1 = "+num1+ " and num2 = "+num2);

		num1 = (short)(num1 + num2);
		num2 = (short)(num1 - num2);
		num1 = (short)(num1 - num2);

		System.out.println("After swapping Num1 = "+num1+ " and num2 = "+num2);
	}
}