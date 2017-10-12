import java.util.Scanner;

public class PE_3 {
	
	public static void main(String[] args)
	{
		String places[] = new String[5];
	    int i;
	    
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter places: ");
		
		//Accepting the places as an array from the user
		for (i=0;i<5;i++)
		{
			places[i]=scan.nextLine();
		}
		
		//Replace all function replaces everything required at once
	    for (i = 0; i < places.length; i++) {
	        String str = places[i];
	        str=str.replaceAll("[aeiou]","");
	        System.out.println(str);
	        
	    }
	}
}
