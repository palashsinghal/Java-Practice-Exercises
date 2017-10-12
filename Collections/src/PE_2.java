
public class PE_2 {
	
	public static void main(String[] args)
	{
		String str = "one one -two__two,,three,one @three*one?two";
		String[] array = str.split(",-@*?: __");
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
