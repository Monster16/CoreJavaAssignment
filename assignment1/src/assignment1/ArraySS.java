package assignment1;
import java.util.Scanner;
public class ArraySS {
	
	public static void main(String[] args)   
	{  
	int n=15;  int temp =0;
	Scanner sc=new Scanner(System.in);  
	//System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	//creates an array in the memory of length 10  
	long[] array = new long[15];  
	System.out.println("Enter the elements of the array: ");  
	 

	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();  
	}  
	 for (int i = 0; i < array.length; i++) {     
         for (int j = i+1; j < array.length; j++) {     
            if(array[i] > array[j]) {    
                temp = (int) array[i];    
                array[i] =array[j];    
                array[j] = temp;    
            }     
         }     
     }    
       
     System.out.println();    
	System.out.println("Array elements are: ");  
	// accessing array elements using the for loop  
	for (int i=0; i<n; i++)   
	{  
	System.out.println(array[i]);  
	}  
	}  
	}  