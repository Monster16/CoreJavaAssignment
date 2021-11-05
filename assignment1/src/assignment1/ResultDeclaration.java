package assignment1;
import java.util.Scanner;
public class ResultDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Float number , subj1,subj2,subj3,subj4,subj5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject 1 marks :");
		subj1= sc.nextFloat();
		System.out.println("Enter subject 2 marks :");
		subj2= sc.nextFloat();
		System.out.println("Enter subject 3 marks :");
		subj3= sc.nextFloat();
		System.out.println("Enter subject 4 marks :");
		subj4= sc.nextFloat();
		System.out.println("Enter subject 5 marks :");
		subj5= sc.nextFloat();
		sc.close();
		
		if (subj1>60 && subj2>60 && subj3>60 && subj4>60 && subj5>60)
		{
			System.out.println("You're passed");
			
		}else if (
				 (subj1>60) && (subj2>60) || (subj3<60) || (subj4<60) || (subj5<60)
				&& (subj2>60) && (subj3>60) || (subj4<60) || (subj5<60) || (subj1<60)
				&& (subj3>60) && (subj4>60) || (subj5<60) || (subj1<60) || (subj2<60)
				&& (subj4>60) && (subj5>60) || (subj1<60) || (subj2<60) || (subj3<60)
				&& (subj5>60) && (subj1>60) || (subj2<60) || (subj3<60) || (subj4<60)
				)
				
		{
			System.out.println("You're promoted");
		}
		else
		{
			System.out.println("You're failed");	
	    }

	}
}
