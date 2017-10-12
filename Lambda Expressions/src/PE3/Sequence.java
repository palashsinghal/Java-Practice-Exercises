package PE3;

import java.util.Scanner;

interface selector{
	void end();
	void current(int num);
	void next(int num);
}

public class Sequence {
	
	public static void main(String[] args)
	{
		//Accepting the number to be processed
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.next());
		
		//Creating an object of nested class and passing the number in the method
		Sequence sequence = new Sequence();
		Sequence.ReverseSequenceSelector obj1 = sequence.new ReverseSequenceSelector();
		obj1.current(number);
	}
	
	
	public class ReverseSequenceSelector implements selector
	{

		@Override
		public void end() {
			System.exit(0);
		}

		
		/*The number is passed in current method. If the number is 0, the control shift to end
		 * method which ends the program. If not, it prints the number and shifts the control to
		 * next method which recursively calls current again
		 */
		@Override
		public void current(int num) {
			
			if(num == 0)
				end();
			else
			{
				System.out.println(num);
				next(num);
			}
		}

		@Override
		public void next(int num) {
			current(num-1);
		}
		
	}
}
