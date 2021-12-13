package simplilearn.java;

public class MethodDemo {

	public int multiplyNumbers(int a, int b) {
		return a * b;
	}

	int val = 150;

	// callByValue
	int operation(int val) {
		val = val * 10 / 100;
		return val;
	}

	public static void main(String[] args) {
		MethodDemo objDemo = new MethodDemo();

		int result = objDemo.multiplyNumbers(12, 12);
		System.out.println("Multiplication of numbers is: " + result);

		System.out.println("Before operation value of data is: " + objDemo.val);
		objDemo.val = objDemo.operation(100);
		System.out.println("After operation value of data is: " + objDemo.val);
	}

}
