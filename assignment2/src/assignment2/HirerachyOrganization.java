package assignment2;

public class HirerachyOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	          Manager m1 = new Manager("Nikhil",20000,500,1500,3000);
	          System.out.println("Salary of Manager= "+m1.getSalary());
	          Labour l1 = new Labour("kalia",10000,200,500);
	          System.out.println("Salary of Labour= "+l1.getSalary());
	     }

	}

	

	class Employee
	{
	     String name;
	     double salary;
	     Employee()
	     {
	          name = null;
	          salary = 0;
	     }
	     Employee (String name, int salary)
	     {
	          this.name = name;
	          this.salary = salary;
	     }
	     double getSalary()
	     {
	          return salary;
	     }
	}
 
	class Manager extends Employee
	{
	     int hra, ta, incentive;
	     Manager()
	     {
	          super();
	          hra = ta = incentive= 0;
	     }
	     Manager(String n, int sal, int h, int t, int incen)
	     {
	          super(n, sal);
	          hra = h;
	          ta = t;
	          incentive= incen;
	     }
	     double getSalary()
	     {
	          return (super.getSalary()+hra+ta+incentive);
	     }
	}
	
	class Labour extends Employee
	{
	     int hra, ta;
	     Labour()
	     {
	          super();
	          hra = ta = 0;
	     }
	     Labour(String n, int sal, int h, int t)
	     {
	          super(n, sal);
	          hra = h;
	          ta = t;
	     }
	     double getSalary()
	     {
	          return (super.getSalary()+hra+ta);
	     }
	}