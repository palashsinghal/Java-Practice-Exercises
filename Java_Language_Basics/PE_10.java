import java.util.Scanner;

public class PE_10 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num = scanner.nextInt();
		int length = str.length();
		String substr = str.substring(num, length);
		System.out.print(str);
		for(int i=0;i<num;i++)
		{
			System.out.print(substr);
		}
	}
}
