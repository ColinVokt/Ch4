package colinvokt.ch4;
import java.util.Scanner;

/*DOESNT WORK
 * Colin Vokt
 * 9/18
 * compute the area of a circle
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		final double PI = 3.1415926535979323846263438327950288419716939;
		
		 double radius;
		 
		 double area = 0;
		
		 
		 
		 
		 System.out.println("enter the radius of the circle and press enter");
		 radius = input.nextDouble();
		
		 if (radius < 0) {
			 area = radius*radius*PI;
				
		System.out.println("After you entered the radius of " + radius + " We have computed the area of your " + "circle as: "  + area +"\"");
		
		 }
		 else {
			 System.out.println("Can't have a radius of 0 or less");
		 }
		 System.out.println("Program is finished");
	}

}
