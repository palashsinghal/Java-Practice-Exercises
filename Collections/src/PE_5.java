import java.util.HashMap;
import java.util.Map;

public class PE_5 {
	
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Palash");
		map.put(2, "Singhal");
		map.put(2, map.get(1));
		map.put(1, "");
		System.out.println(map);
	}
}
