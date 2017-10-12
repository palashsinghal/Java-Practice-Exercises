import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PE_2 {
	
	public static void main(String[] args)
	{
		//Creating an instance of calendar class
		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

		//Creating a date instance and setting it's format used for printing
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println("First Date of Week: " + df.format(c.getTime()));
		for (int i = 0; i < 6; i++) {
			c.add(Calendar.DATE, 1);
		}

		System.out.println("Last Date of Week: " + df.format(c.getTime()));

	}
}
