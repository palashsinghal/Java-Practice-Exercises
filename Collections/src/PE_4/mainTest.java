package PE_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mainTest {
	
	public static void main(String[] args)
	{
		List<student> list = new ArrayList<student>(5);

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			student s = new student();
			System.out.println("Enter name, id, age: ");
			s.setName(scan.nextLine());
			s.setId(scan.nextLine());
			s.setAge(scan.nextInt());
			String s1 = scan.nextLine();
			list.add(s);
			// System.out.println(s.getName()+s.getid()+s.getage());
		}

		Collections.sort(list, new studentSorter());

		for (int i = 0; i < 5; i++)
			System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());

	}
}
