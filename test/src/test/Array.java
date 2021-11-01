package test;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args)   
	{  
	int n=15; 
	Scanner sc =new Scanner(System.in); 
	
	int[] array = new int[15]; 
	
	for(int i=0; i<n; i++)  
	{   
	array[i]=sc.nextInt();  
	}  
	
	int c=0;
	 for(int i=0;i<15;i++)
	 {
	     if(array[i]==19)
	     {
	         c++;
	         break;
	     }
	     
	 }
	 
       if(c==1)
	     System.out.print("yes it contains");
	     else
	     System.out.print("No");
	}
	}