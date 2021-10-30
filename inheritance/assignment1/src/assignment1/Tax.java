package assignment1;
import java.util.Scanner;

public class Tax {

	public static void main(String args[])
	{
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	it=sc.nextDouble();
	if(it<=180000)
		tax=0;
	else if(it<=180001 || it<=300000)
		tax=0.1*(it);
	else if(it<=300001 || it<=500000)
		tax=0.2*(it);
	else {
		tax=0.3*(it);
	    
	}
	System.out.println("Income tax amount is "+tax);
}
	
}