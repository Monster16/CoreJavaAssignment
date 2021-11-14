package genericDemo;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		Integer arr[] = {22,34,56,34,23,45,78};
		String arr1 [] = {"anil","amit"};
		// TODO Auto-generated method stub
		myGenericClass <Integer> myGenericClass1 = new myGenericClass<> (arr);
		myGenericClass1.getArr();
		myGenericClass1.printElements(arr);

		System.out.println("-----------------------------");
		myGenericClass <String> myGenericClass2 = new myGenericClass<> (arr1);
		myGenericClass2.getArr();
		myGenericClass2.<String>printElements(arr1);
	
	
	
	}

} 

 class myGenericClass<T>{
	 private T[] arr;

	public myGenericClass(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}
	
	public <E> void printElements(E[] arr) {
		for (E e : arr) {
			System.out.println(e);
			
		}
	}
	
 }
