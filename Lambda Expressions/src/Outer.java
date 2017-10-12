
public class Outer {
	
	class Inner{
		
		public void print()
		{
			System.out.println("You are in Inner");
		}
	}
	
	
	public static void main(String args[])
	{
		//Creating an object of outer class and using it to create an object of inner class
		Outer outer = new Outer();
		Outer.Inner innerobj1 = (Inner) outer.method(outer);
		innerobj1.print();
	}
	
	public Object method(Outer outer)
	{
		Outer.Inner innerobj = outer.new Inner();
		return innerobj;
	}
}
