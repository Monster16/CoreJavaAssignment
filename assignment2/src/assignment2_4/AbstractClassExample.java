package assignment2_4;

abstract class MyClass {
	   public void display() {
	      System.out.println("This is a method of abstract class");
	   }
	}
	public class AbstractClassExample extends MyClass{
	   public static void main(String args[]) {
	      new AbstractClassExample().display();
	   }
	}