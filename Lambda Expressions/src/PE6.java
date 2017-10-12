interface multiplication
{
	void multiply(int num);
}

public class PE6 {
	
	public static void main(String[] args)
	{
		//Using lambda expression to work with the multiplication interface
		multiplication m = (num) -> {
			System.out.println("Result: "+num*2);
		};
		
		m.multiply(26);
	}
}
