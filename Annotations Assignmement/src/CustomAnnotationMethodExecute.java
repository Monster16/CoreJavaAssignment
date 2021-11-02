

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;  
import java.lang.reflect.*;  




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Execute{
	
	int Sequence() ;
}


class MyClass1{	
	
	  @Execute(Sequence=2)
	  public void myMethod1()
	      {
		  System.out.println("In method1 giving priority to sequence 2");
		  } 
	  
	  @Execute(Sequence=1)
	  public void myMethod2()
	      {
		  System.out.println("In method2 giving priority to sequence 1");
		  } 
	  
	  @Execute(Sequence=3)
	  public void myMetho31()
	      {
		  System.out.println("In method3 giving priority to sequence 3");
		  } 
	  }
	
	

public class CustomAnnotationMethodExecute {
	
	public static void main(String[] args) throws Exception {
		
		MyClass1 mc = new MyClass1();
		
		
		Method e = mc.getClass().getMethod("myMethod1");
		Annotation ann = e.getAnnotation(Execute.class);
		Execute ts = (Execute)ann;
		System.out.println( ts.Sequence());
		
		
	}

}
