package elearnings;
		import java.util.Arrays;
		import java.util.List;
		import java.util.Scanner;
		import java.util.regex.Pattern;
		import java.util.regex.Matcher;
		public class ValidationOfEmail {
		
		    static String [] dataBase= {"pratiksha.com","pratiksha@gmail.com","pratiksha.in"};
			public static void main(String[] args) {
		        Scanner s= new Scanner(System.in);
		        String userID;
				while (true){
			     System.out.println(" Please Enter your User ID ");
			     userID = s.next();
			     while(VerfiyFormate(userID))
			     {
				     System.out.println("Please..enter your User ID with valid format  ");
				     userID = s.next();
			     }			     
			     VerfiyID(userID);
			     System.out.println("");
				}		
			}
			
			private static void VerfiyID(String ID)
			{
				boolean accessFlag= false;
			     for(String id : dataBase)
			     {
			    	 if(ID.equalsIgnoreCase(id))
			    	 {
			    		 accessFlag=true;
				    	 System.out.println("access grant to "+ ID );
			    		 break;
			    	 }   	 
			     }
			     
			     if(accessFlag==false)
			     {
			    	 System.out.println("access deined to "+ ID );
			    	 }
			}
			
			private static boolean VerfiyFormate(String ID)
			{
				String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

				Pattern pattern = Pattern.compile(regex);
			    Matcher matcher = pattern.matcher(ID);

				if(!matcher.matches())
				{
					return true;
					
				}else 
				{
					return false;	
				}	
			}
	}


