interface factorization
{
	void test(int num1, int num2);
}


public class PE7 {
	public static void main(String[] args)
	{
		//Using lambda expression to work with factorization interface
		factorization factor = (num1,num2) -> {
			int num = num1%num2;
			if(num == 0)
				System.out.println(num2+" is a factor of "+num1);
			else
				System.out.println(num2+" is not a factor of "+num1);
		};
		
		factor.test(16, 4);
	}
	
}
