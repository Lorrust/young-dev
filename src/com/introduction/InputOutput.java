package com.introduction;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {

//		BMI via Scanner

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scan.next();

		System.out.print("Enter your weight in kg: ");
		double weight = scan.nextDouble();

		System.out.print("Enter your height in m: ");
		double height = scan.nextDouble();

		scan.close();

		double bmi = weight / (height * height);

		System.out.println(name + ", your BMI is " + bmi);

	}

}
