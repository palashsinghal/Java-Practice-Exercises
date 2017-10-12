
public class PE_4 {
	
	public static void main(String[] args)
	{
		String white = "WW";
		String black = "BB";
		
		/*
		 * Created two loops for the two row formats. The logic is to fill the values leaving one space
		 */
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=8;i=i+2)
			{
				System.out.print(white+black);
			}
			
			System.out.print("\n");
			for(int i=1;i<=8;i=i+2)
			{
				System.out.print(white+black);
			}
			System.out.print("\n");
		}
		
		

	}
}
