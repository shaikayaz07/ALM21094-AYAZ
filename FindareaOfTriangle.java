package almamatters;

import java.util.Scanner;

public class FindareaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the height of the Triangle:");
		Double base = scanner.nextDouble();
		
		System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();
        
        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is: "+ area);
	}

}
