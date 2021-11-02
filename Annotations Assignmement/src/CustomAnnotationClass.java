
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;	
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;



@Target(ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
@interface Info  {
	
	    int AuthorID () default 1;
		String Author()  default "Anil";
		String Supervisor()  default "Onkar";
		String Date() default "02/11/2021";
		String TIme() default "14:50";
		int Version() default 10;
		String Description() default "This is just an assignment";
		
	}


@Info ()
class myclass{
		
		
	}
public class CustomAnnotationClass {
		
	public static void main(String[] args) {
			
			myclass ns = new myclass();
			
		
			Class f  = ns.getClass();
			Annotation annn = f.getAnnotation(Info.class);
			Info i = (Info)annn;
			System.out.println("AuthorID:"+i.AuthorID()); 
			System.out.println("Author:"+i.Author()); 
			System.out.println("Supervisor:"+i.Supervisor()); 
			System.out.println("Date:"+i.Date()); 
			System.out.println("Time:"+i.TIme()); 
			System.out.println("Version:"+i.Version()); 
			System.out.println("Description:"+i.Description()); 
			
			 
		}

	}
