import java.util.*;
public class PE_9 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int length = str.length();
		for (int i=length-1;i>=0;i--)
			System.out.print(str.charAt(i));
	}
	
}

