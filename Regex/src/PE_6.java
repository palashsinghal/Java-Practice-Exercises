import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PE_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//Input for matching the regex pattern
		System.out.println("Enter input : ");
		String input = scan.nextLine();

		//regex pattern to be matched
		System.out.println("Enter input : ");
		String patternString = scan.nextLine();

		//Pattern object to compile the regex
		Pattern pattern = Pattern.compile(patternString);
		//Matching the input with regex
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {

			System.out.println("Found at : " + matcher.start() + " - " + matcher.end());
		}
	}
}