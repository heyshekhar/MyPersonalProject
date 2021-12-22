package javaExample;

public class JavaInnerClass {

	public static void main(String arg[]) {
		
		JavaInnerClass javaInnerClass = new JavaInnerClass();
		javaInnerClass.display();
	}
	
	public void display() {
		
		InnerClass innerClass = new InnerClass();
		innerClass.show();
	}
	
	class InnerClass{
		public void show() {
			System.out.println("this is inner class...");
		}
	}
}
