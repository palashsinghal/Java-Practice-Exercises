import java.util.Scanner;

public class PE_1 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number of rows of matrix: ");
		int rows = scanner.nextInt();
		System.out.print("Input number of columns of matrix: ");
		int cols = scanner.nextInt();
		
		//Declaring and initializing the input matrices
		int[][] arr1 = new int[rows][cols];
		int[][] arr2 = new int[rows][cols];
//		arr1 = null; arr2 = null;
		
		//Inputting the values of the matrices
		System.out.print("Input elements of first matrix ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				arr1[i][j] = scanner.nextInt();
		}
		
		System.out.print("Input elements of second matrix ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				arr2[i][j] = scanner.nextInt();
		}
		
		//Declaring and calculating the addition variable
		int[][] sum = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				sum[i][j] = arr1[i][j] + arr2[i][j];
		}
		
		for( int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				System.out.print(sum[i][j]+" ");
			
			System.out.println("\n");
		}
	}
}
