
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;  
import java.lang.reflect.*;  




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Test{
	
	String TestCase()  ;
}


class test1{	
	
	  @Test(TestCase = "This is just a test case for Annotation")
	  public void sayHello()
	      {
		  System.out.println("hello annotation");
		  }  
	  
	      
	}
	
	

public class CustomAnnotationMethod {
	
	public static void main(String[] args) throws Exception {
		
		test1 t = new test1();
		
		
		Method d = t.getClass().getMethod("sayHello");
		Annotation ann = d.getAnnotation(Test.class);
		Test ts = (Test)ann;
		System.out.println( ts.TestCase());
		t.sayHello();
		
	}

}
