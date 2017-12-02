package serialpractice;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {

	String name;
	int num;

	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
}
