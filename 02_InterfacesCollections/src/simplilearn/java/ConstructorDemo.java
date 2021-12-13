package simplilearn.java;

class Employee {
	int id;
	String name;

	void display() {
		System.out.println("Employee Id: " + id + " name: " + name);
	}
}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Student Id: " + id + " name: " + name);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.display();
		emp2.display();
		
		System.out.println("***********************");
		
		Student s1 = new Student(121, "Alex");
		Student s2 = new Student(232, "John");
		
		s1.display();
		s2.display();
	}

}
