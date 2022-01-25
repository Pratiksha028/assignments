package accessspecifier;

public class PrivateExample {
	private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		PrivateExample  obj = new PrivateExample(); 
        

	}
}

