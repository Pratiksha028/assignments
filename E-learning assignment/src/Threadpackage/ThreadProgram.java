package Threadpackage;

public class ThreadProgram extends Thread {
	
	 	public void run()
	 	{
	  		System.out.println(" Thhread started running");
	}
	 	public static void main( String args[] )
	 	{
	  		ThreadProgram t = new ThreadProgram();
	  		t.start();
	 	}


}
