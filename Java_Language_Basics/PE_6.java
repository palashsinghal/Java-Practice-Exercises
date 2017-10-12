import java.util.Scanner;
public class PE_6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = input.next(".").charAt(0);
		if(ch>='A'&& ch<='Z')
			System.out.println("Character is a capital letter");
		else if(ch>='a' && ch<='z')
			System.out.println("Character is a small letter");
		else if(ch>='0' && ch<='9')
			System.out.println("Character is a number");
		else
			System.out.println("Character is a special symbol");
	}
	
}

