package elearnings;

public class ConstructorProgram {
	private String name;
	  ConstructorProgram() {
	    System.out.println("Constructor Called:");
	    name = "Java Assignments";
	  }

	  public static void main(String[] args) {

	    ConstructorProgram obj = new ConstructorProgram();
	    System.out.println("This is " + obj.name);
	  }
	}


