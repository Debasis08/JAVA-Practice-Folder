// write a java program, enter three numbers by using command line argument and find out greatest among them

class FindGreatest {
	public static void main(String[] x) {
		int num1 = Integer.parseInt(x[0]);
		int num2 = Integer.parseInt(x[1]);
		int num3 = Integer.parseInt(x[2]);
		float num4 = Float.parseFloat(x[3]);

		if ((num1 >= num2) && (num1 >= num3) && (num1 >= num4)) {
			System.out.println("num1 i.e. " + num1 + " is greatest");
		} else if ((num2 >= num1) && (num2 >= num3) && (num2 >= num4)) {
			System.out.println("num2 i.e. " + num2 + " is greatest");
		} else if ((num3 >= num1) && (num3 >= num2) && (num3 >= num4)) {
			System.out.println("num3 i.e. " + num3 + " is greatest");
		} else if ((num4 >= num1) && (num4 >= num2) && (num4 >= num3)) {
			System.out.println("num3 i.e. " + num4 + " is greatest");
		}
	}
}