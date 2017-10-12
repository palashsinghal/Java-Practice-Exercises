import java.util.Scanner;

public class PE_5 {
	
	public static void main(String[] args)
	{
		int[] arr = new int[7];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<7;i++)
			arr[i] = scanner.nextInt();
		
		int count = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(Math.abs(arr[i] - arr[i+1]) == 1)
				count++;
		}
		
		if(count == (arr.length-1))
			System.out.println("Numbers are consecutive");
		else
			System.out.println("Numbers are not consecutive");
	}
}
