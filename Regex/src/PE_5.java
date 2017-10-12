import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class PE_5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input : ");
		//Providing the input to be matched
		String input=scan.nextLine();

		//Matching the input with the regex and printing the result.
		System.out.println("Is Harry here ? "+input.matches(".*\\bharry\\b.*"));
		
		
	}

}
