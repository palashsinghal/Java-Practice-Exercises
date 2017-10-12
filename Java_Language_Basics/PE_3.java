import java.util.Scanner;
public class PE_3 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = input.nextLine();
		int length = str.length();
		try{
			int num=Integer.parseInt(str);
			System.out.println("Error");
		}
		
		catch(NumberFormatException e){
			
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
				System.out.println(str.charAt(i)+" - vowel");
			else
				System.out.println(str.charAt(i)+" - Consonant");
		}

	}
}
}

