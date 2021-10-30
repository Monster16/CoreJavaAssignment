package assignment1;
import java.util .*;

public class SimpleCompound {

	
	    public static void main (String arg[])
	{
	    double amount, rate, time, sim,com;
	    Scanner sc=new Scanner (System. in);
	    System.out.print("Enter the amount:");
	    amount=sc.nextDouble();
	    System. out. print("Enter the No.of years:");
	    time=sc.nextDouble();
	    System. out. print("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sc.close();
	    sim=(amount * time * rate)/100;
	    com=amount * Math.pow(1.0+rate/100.0,time) - amount;
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	   }
	}