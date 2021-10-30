package assignment1;
import java.util.Scanner;
import java.lang.Math;

public class armstrongNumber {
	static boolean isArmstrongNumber(int n)
	{
		int temp, digits=0, last=0,sum=0;
		temp=n;
		while (temp>0)
		{
			temp=temp/10;
			digits++;
			
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;
		    else return false;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		if(isArmstrongNumber(num))
		{
			System.out.println("Armstrong");
		}
		else 
		{
			System.out.println("not  Armstrong");
		}
		
		
		

	}

}
