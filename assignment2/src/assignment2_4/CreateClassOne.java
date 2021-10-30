package assignment2_4;

abstract class ClassOne {

	   public void printSomething()
	   {
	     System.out.println("Hello in abstract class");
	   }
	}
	class CreateClassOne {

	 public static void main(String[] args)
	 {
	     // instance of abstract 
	       // class "ClassOne"
	     ClassOne obj = new ClassOne();
	 }
	}