package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a
{
    public static void main(String args[])
    {
        
       try
       {
            String[] str = {"Sun", "Mon", "Tue"};        
        
         List<String> list = Arrays.asList(str);
 		 List<String> l = new ArrayList<>(list);
         l.add("wed");
         for(String s: l )
         System.out.println(s);

       }
        catch(UnsupportedOperationException un)
      {
       System.out.print("UnsupportedOperationException");   
      }
       try
       {
           int a=20;
           int b=0;
           int d=a/b;
       }
       catch(ArithmeticException e)
       {
         System.out.print("handled exception");  
       }
     
      
    }
}