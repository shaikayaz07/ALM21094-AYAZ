package almamatters;

import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		//Capture the input in an integer
		int num=scan.nextInt();
			scan.close();
		for(int i=2;i<=num/2;i++)
		{
			 temp=num%i;
			 if(temp==0)
			 {
				  isPrime=false;
				  break;
			 }
		}
        //If isPrime is true then the numberis prime else not
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + "is not a Prime Number");
	}

}
