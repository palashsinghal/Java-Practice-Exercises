import java.util.Arrays;
import java.util.Scanner;

public class PE_7 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int length = (int) Math.log10(num)+1;
		int[] arr = new int[length];
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			arr[i] = (int) (num/Math.pow(10, (i+1)));
			sum=sum+arr[i];
		}
		for(int i = 0;i<length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println(arr);
		Arrays.sort(arr);
		if(sum>15)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
}
