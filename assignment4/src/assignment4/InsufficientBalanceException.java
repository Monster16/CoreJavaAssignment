package assignment4;
import java.util.*;
import java.util.Scanner;

public class InsufficientBalanceException {

	
	
	    static void fun() throws IllegalAccessException 
	    { 
	        double balance = 1000,  wamount;
	        
	        Scanner wd=new Scanner(System.in);
	        System.out.println("Withdraw an amount");
	        wamount=wd.nextInt();
	        balance -= wamount;


	        if (balance<0)
	        {
	        throw new IllegalAccessException(); 
	        }
	        else
	        System.out.println("Your reamining balance is:"+balance);
	    }



	    public static void main(String args[]) 
	    { 

	        try
	        { 
	            fun(); 
	        } 
	        catch(IllegalAccessException ex) 
	        { 
	            System.out.println("Insufficient Balance"); 
	        } 
	    } 
	} 