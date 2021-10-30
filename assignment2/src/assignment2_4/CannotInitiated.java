package assignment2_4;


abstract class MyClass1{
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract public void disp2();
	}

 class CannotInitiated extends MyClass1{
	   /* Must Override this method while extending
	    * MyClas
	    */
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       Demo obj = new Demo();
	       obj.disp2();
	   }
	}