package intro.methods;

import javax.swing.JOptionPane;

public class MethodExample {

	static int globalVar = 10;

	public static void main(String[] args) {
		double grade1 = 10;
		double grade2 = 7.0;

		System.out.println(verifyApproval(calculateAvg(grade1, grade2)));

		int x = 20;
		manipulatePrimitive(x);
		System.out.println(x);

		System.out.println("Global variable also here: " + globalVar);
	}

	public static void manipulatePrimitive(int number) {
		number += 10;
		System.out.println(number);
	}

	public static double calculateAvg(double n1, double n2) {
		System.out.println("A global var is visible within the whole class: " + globalVar);
		return (n1 + n2) / 2;
	}

	public static String verifyApproval(double avg) {
		if (avg >= 7) {
			return "Approved";
		} else {
			if (avg < 3) {
				return "Failed";
			}
		}
		return "Rework";
	}

	public static void testVariables() {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
	}
	
	public static int selectMenu() {
		String m = "1 - Hello\n"
				+ "2 - World"
				+ "3 - Test";
		
		int option = Integer.parseInt(JOptionPane.showInputDialog(m));
		if (option < 1 || option > 4) {
			return selectMenu();
		}
		return option;
	}

}
