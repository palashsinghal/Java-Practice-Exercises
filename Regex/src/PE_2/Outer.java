package PE_2;
import java.util.Scanner;

public class Outer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Entering the name and age as inputs
		System.out.println("Enter Name:");
		String nn = sc.nextLine();
		System.out.println("Enter age:");
		int mm = sc.nextInt();

		//Calling the constructor to initialize the
		Inner obj = create(nn, mm);
		System.out.println("Name:" + obj.name);
		System.out.println("Age:" + obj.age);

	}
	
	static class Inner {

		String name = null;
		int age;

		public Inner(String n, int m) {
			this.name = n;
			this.age = m;
		}

	}

	public static Inner create(String n, int m) {
		return new Inner(n, m);
	}
}


