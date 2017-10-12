import java.util.Scanner;
public class PE_1 {
	public static void main(String args[]) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = reader.nextInt(); 
	String str = Integer.toString(num);
	int length = str.length();
	int count=0;
	for(int i=0;i<length;i++)
	{
		if(str.charAt(i)==str.charAt(length-1-i))
			count++;
	}
	
	int sum=0;
	
	if(count==length)
	{
		for(int i=0;i<length;i++)
		{
			if((num%10)%2==0)
				sum = sum + num%10;
			num=num/10;
		}
		
		if(sum>25)
			System.out.println(str+" is a palindrome and the sum is greater than 25");
		else
			System.out.println(str+" is a palindrome and the sum is less than 25");
	}
	
	else
	{
		System.out.println(str+" is not a palindrome");
	}
}
	
}

