package simplilearn.java;


abstract class AnonymousInnerClass {
	public abstract void display();
}

public class InnerClassDemo {

	private String message = "Welcome to Java";

	class Inner {
		void hello() {
			System.out.println(message + ", Let us start learning Inner Classes");
		}
	}

	void display() {
		@SuppressWarnings("hiding")
		class Inner {	
			void msg() {
				System.out.println(message);
			}
		}
		Inner inO = new Inner();
		inO.msg();
	}

	public static void main(String[] args) {
		InnerClassDemo obIn = new InnerClassDemo();
		InnerClassDemo.Inner obDemo = obIn.new Inner();
		obDemo.hello();
		
		System.out.println("***************");
		new InnerClassDemo().new Inner().hello();

		System.out.println("***************");
		new InnerClassDemo().display();		
		
		AnonymousInnerClass cls = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		
		cls.display();
	}
}
