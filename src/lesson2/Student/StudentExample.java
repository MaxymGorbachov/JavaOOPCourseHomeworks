package lesson2.Student;

import java.time.LocalDate;

/**
 * @author Alexander Tyshchenko.
 */
public class StudentExample {

	public static void main(String[] args) {
		StudentList list = new StudentList();

		/*
		 * Old Date class
		 */
//		list.add(new Student("Dima", "Stepurenko", new Date(1986 - 1900, 1, 1)));
//		list.add(new Student("Vasya", "Pupkin", new Date(1970 - 1900, 3, 28)));

		list.add(new Student("Dima", "Stepurenko", LocalDate.of(1986, 1, 1)));
		list.add(new Student("Vasya", "Pupkin", LocalDate.of(1970, 3, 28)));

		int n = list.find("Vasya");
		System.out.println(list.get(n).getBirth().toString());
	}
}
