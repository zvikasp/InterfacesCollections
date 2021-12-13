package simplilearn.java;

public class overloadMethod {

	void area(int b, int h) {
		System.out.println("Area of Triangle: " + (0.5 * b * h));
	}

	void area(int r) {
		System.out.println("Area of Circle: " + (2 * Math.PI * r * r));
	}

	public static void main(String[] args) {
		overloadMethod lm = new overloadMethod();
		lm.area(10, 12);
		lm.area(7);
	}

}
