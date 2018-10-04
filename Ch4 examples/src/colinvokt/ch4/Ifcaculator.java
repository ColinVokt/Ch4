package colinvokt.ch4;

import java.util.Scanner;

/*DOESNT WORK
 * Colin Vokt
 * 10/18
 */
public class Ifcaculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get 2 numbers from user
		
		System.out.println("Enter the first value");
		double num1 = input.nextDouble();
		System.out.println("Enter the second value");
		double num2 = input.nextDouble();
		//Get the operator
		System.out.println("Do you want to + - * / or %");
		String opp = input.nextLine();
		String plus = "+";
		
		double total = 0;
		//Test input
		if (opp.equals("+")) {
			 total = num1 + num2;
		}
		else if (opp.equals("-")) {
			 total = num1 - num2;
		}
		else if (opp.equals("*")) {
			total = num1 * num2;
		}
		else if (opp.equals("/")) {
			total = num1 / num2;
		}
		else if (opp.equals("%")) {
			total = num1 % num2;
		}
		else {
			System.out.println("That wasen't an operator");
		}
		//Do calculations
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(opp);
		
		//Print output
		
		System.out.println("Tour total was: "+ total);
		
		
		
		
		
		
		
		
		
	}

}
