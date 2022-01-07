package fsdtraining;

import java.util.Scanner;

public class Splitwithoutfunc {
	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		System.out.println("enter string");
		String string1 = s.nextLine();
		
		for(int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) == ' ') {
				System.out.println();
			}
			System.out.print(string1.charAt(i));
		}
		}

}
