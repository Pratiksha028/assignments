package elearnings;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[]){  
		int data = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter numbers");
		int a= s.nextInt();
		int b= s.nextInt();
		
		   try{  
		       
		     data=a/b;  
		   }catch(ArithmeticException e)
		   
		   {
			   System.out.println(e);
			   }
		   System.out.println("result is "+data);  
		  }  
		}  


