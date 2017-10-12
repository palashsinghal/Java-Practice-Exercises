import java.util.Scanner;
public class PE_2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if((num>20&&num<30)&&num%2!=0)
			System.out.println("Tom");
		if((num>20&&num<30)&&num%2==0)
			System.out.println("Jerry");
	}
}

