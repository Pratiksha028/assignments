package oopsconcepts;

import java.util.Scanner;

public class ClassAndObjects {
	Scanner sc= new Scanner(System.in);
	int id= sc.nextInt();  
	 String name= sc.nextLine();  
	}  
	
	class TestStudent1{  
	 public static void main(String args[]){  
	  ClassAndObjects s=new ClassAndObjects();  
	  System.out.println(s.id);  
	  System.out.println(s.name);  
	 }  
	}  


