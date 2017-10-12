package PE_4;

import java.util.Comparator;

public class studentSorter implements Comparator<student>{

	public int compare(student s1, student s2) {
		int compare = s1.getAge() - s2.getAge();
		if(compare == 0)
		{
			int compare1 = s1.getName().compareTo(s2.getName());
			if(compare1 == 0)
			{
				return s1.getId().compareTo(s2.getId()); 
			}
			else
				return compare1;
		}
		return compare;
	}
	
}
