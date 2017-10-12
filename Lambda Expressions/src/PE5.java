interface functional
{
	void printLength(String str);
}
public class PE5 {
	
	public static void main(String[] args)
	{
		//Using the lambda function to work with the functional interface
		functional f1 = (str) -> {
			System.out.println("The length is: "+str.length());
		};
		
		f1.printLength("My name is Palash");
	}
}
