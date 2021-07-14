package almamatters;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("Enter the radius: ");
           /*We are storing the entered radius in double 
            * because a user can enter radius in decimals 
            */
           double radius = scanner.nextDouble();
           //Area = PI*radius
           double area = Math.PI * (radius * radius);
           System.out.println("The area of circle is:" + area);
           //Circumference = 2*PI*radius
           double circumference= Math.PI * 2*radius;
           System.out.println("The circumference of the circleis:"+circumference);
	}

}
