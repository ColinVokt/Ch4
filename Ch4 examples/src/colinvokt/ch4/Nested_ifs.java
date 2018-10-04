package colinvokt.ch4;

/*
 * Colin Vokt
 * 10/18
 */


public class Nested_ifs {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		if (x < y) {
			System.out.println("x is less then y");
			if (z > y) {
				System.out.println("z is greater then y");
				if( x > z ) {
					System.out.println("x is greater then z");
					
				}
				else {
					System.out.println("x is less then z");
				}
			}
			else {
				System.out.println("second condition wasen't true");
			}
		
	}
	else {
		System.out.println("first condition wasen't true");
	}
		System.out.println("Program is finished");
	}
}
	
	
