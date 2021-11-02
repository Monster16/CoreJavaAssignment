package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;



@Target(ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
@interface smartPhone  {
	String os() default "Symbian";
	int Version() default 1;
	
}


@smartPhone (os="Android", Version=6)
class NokiaASeries{
	
	String Model;
	int Size;
	public NokiaASeries(String model, int size) {
		
		Model = model;
		Size = size;
	}
	
}
public class AnnotionsDemo {
	
	public static void main(String[] args) {
		
		NokiaASeries ns = new NokiaASeries("Fire", 5);
		//System.out.println(ns.Model);
		
		
		Class c  = ns.getClass();
		Annotation an = c.getAnnotation(smartPhone.class);
		smartPhone sp = (smartPhone)an;
		System.out.println(sp.os());
	}

}
