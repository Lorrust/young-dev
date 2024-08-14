package basic.interfaces;

public class UsingInterfaces {

	public static void main(String[] args) {

		FunctionalInterfaceCalculator c1 = (v1, v2) -> v1 * v2;
		FunctionalInterfaceCalculator c2 = (v1, v2) -> v1 / v2;
		FunctionalInterfaceCalculator c3 = (v1, v2) -> Math.pow(v1, v2);
		
		System.out.println(c1.calculate(5.0, 10.0));
		System.out.println(c2.calculate(8.0, 2.0));
		System.out.println(c3.calculate(3.0, 3.0));
	}

}