import java.util.*;
public class PE_8 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num, target=27;
		while (true)
		{
			System.out.print("Enter the number. The number should be within 1-50: ");
			num = input.nextInt();
			if(num>=1 && num<=50)
			{
				
			}
			else
				{
				System.out.println("Please enter within the correct range");
				continue;
				}
			
			if(num>target)
			{
				System.out.println("Number is more than target");
				continue;
			}
			
			if(num<target)
			{
				System.out.println("Number is less than target");
				continue;
			}
			
			if(num==target)
			{
				System.out.println("Number is equal to the target");
				break;
			}
		}
		
		
			
	}
}


