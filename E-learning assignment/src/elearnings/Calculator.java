package elearnings;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("What operation do you want perform?");
		char operator = s.next().charAt(0);
		switch(operator)
		{
		case '+':
		{
	        result=a+b;
			System.out.println("Addition of " + a + " and " + b +  " is "+result);
			break;
		}
		case '-':
		{
			result=a-b;
			System.out.println("Substraction of " + a + " and "+ b + " is "+result);
			break;
		}
		case '*':
		{
			result = a*b;
			System.out.println("Multiplication of "+ a +" and "+ b + " is " +result);
			break;
		}
		case '/':
		{
			result=a/b;
			System.out.println("Division of " + a + " and " + b + " is " +result);
			break;
		}
	
		default:
		{
			System.out.println("Invalid operator");
		}		
		}
	}
}
