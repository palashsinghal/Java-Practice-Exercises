import java.util.HashMap;
import java.util.Map;

public class PE_3 {
	
	public static void main(String[] args)
	{
		String[] arr = {"a","b","c","d","a","c","c"};
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		int count = 1;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
					count++;
				
				if(count == 2)
				{
					map.put(arr[i], true);
					break;
				}
				
				map.put(arr[i], false);
			}
			
			count = 1;
		}
		
		System.out.println(map);
	}
}
