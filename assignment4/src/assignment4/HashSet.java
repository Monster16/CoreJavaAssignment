package assignment4;

public class HashSet {

    public static void main(String args[])
    {
    
       try
       {
           int a=20;
           int b=0;
           int c=a/b;
       }
       catch(ArithmeticException e)
       {
         System.out.print("handled exception ");  
       }
       finally
       {
           System.out.print("End of program...");
       }
    }
}
