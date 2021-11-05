package genericAssignment;

import java.util.HashSet;
import java.util.Iterator;

public class GenericAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee(101,"Anil","SE",50000L);
		Employee obj2 = new Employee(102,"Singh","SDE",60000L);
		
		HashSet<Employee> hs = new HashSet<>();
		hs.add(obj1);
		hs.add(obj2);
		
		
		Iterator<Employee> iterate = hs.iterator() ;
		while (iterate.hasNext()) {
			iterate.next().display();
			System.out.println();
			
		}
	}

}

class Employee {
	int id ;
	String Name,Dept;
	long Salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		Name = name;
		Dept = dept;
		Salary = salary;
	}
      public void display() {
    	    System.out.println("ID : " + id);
			System.out.println("Name : "+ Name );
			System.out.println("Salary : " + Salary);
			System.out.println("Department : " + Dept);
			
      }
}