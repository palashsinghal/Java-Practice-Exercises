import java.util.ArrayList;
import java.util.Arrays;

public class PE_1 {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			arrayList.add(arr[i]);
		}
		
		System.out.println(arrayList);
		
	}
}
