package basic.intro;

public class Operators {
	
	public static void main(String[] args) {
		
		int int1 = 10;
		int int2 = -5;
		int int3 = 3;
		
		double dbl1 = 2.5;
		double dbl2 = -5.0;
		double dbl3 = 3.3;
					
		/*
		 * *********************************
		 * * Arithmetic Operation Examples *
		 * ********************************* 
		 */
		
//		Sum
		
		int sum1 = int1 + int2;
		System.out.println("Two int sum = " + sum1);
		
		double sum2 = dbl1 + dbl2;
		System.out.println("Two double sum = " + sum2);
		
		double sum3 = int3 + dbl3;
		System.out.println("Double and int sum = " + sum3);
		
//		Subtraction
		
		int sub1 = int1 - int2;
		System.out.println("Two int subtraction = " + sub1);

//		Multiplication
		
		int mul1 = int1 * int2;
		System.out.println("Two int multiplication = " + mul1);
		
//		Division
		
		int div1 = int1 / int3;
		System.out.println("Two int division = " + div1); // Be careful! When dividing ints, the result will always be an int. Example: 10 / 3 = 3
		
		double div2 = dbl1 / dbl3;
		System.out.println("Two double division = " + div2);
		
//		Remainder
		
		int rem1 = int1 / int3;
		System.out.println("Remainder = " + rem1);
		
//		Exponent
		
		double exp1 = Math.pow(4, 3); // The Math class only works with doubles
		System.out.println("4 to the third power is " + exp1);
		
		/*
		 * *********************************
		 * *  Logical Operation Examples   *
		 * *********************************
		 */
		
//		boolean b1 = true;
//		boolean b2 = false;
//		boolean b3 = true;
		
		System.out.println("AND Operation: true and false? " + (true && false));
		
//		System.out.println("OR Operation: true or false? " + (true || false));
		
		System.out.println("NOT Operation: not false? " + (!false));
		
		/*
		 * *********************************
		 * *   String Operation Examples   *
		 * *********************************
		 */
		
		String str1 = "Home";
		String str2 = "School";
		String str3 = " ";
		String str4 = "10";
		String str5 = "SCHOOL";
		
		char ch1 = 'A';
		char ch2 = 'L';
		
		
		System.out.println(str1 + str3 + str2);
		System.out.println(str4 + dbl1);
		System.out.println("School = SCHOOL? " + (str1 == str5));
		System.out.println("School = SCHOOL? Ignoring  casing: " + (str2.equalsIgnoreCase(str5)));
		
		System.out.println("Substring of School: " + str2.substring(2));
		
		System.out.println(ch1 + ch2); // The ASCII code is used in logical contexts, hence the numeric result

	}
}
