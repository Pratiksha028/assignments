package elearnings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProg {
	public static void main(String[] args) {

		String pattern = "[0-9]+";
		String check = "1hi 2 how 3 are 4 you";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}
	}



