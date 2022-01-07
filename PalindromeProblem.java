package fsdtraining;

import java.util.Scanner;

public class PalindromeProblem {
	public static void main(String[] args) {
		String string1, string2 ="";
		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		string1= s.nextLine();
		int length = string1.length();
		for ( int i= length-1;i>=0;i--)
		
			string2= string2+string1.charAt(i);
			if(string1.equals(string2)) {
				System.out.println("Its a palindrome");
			}
			else {
				System.out.println("Its not a palindrome");
			}
		}
		


}
