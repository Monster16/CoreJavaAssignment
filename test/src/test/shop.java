package test;

abstract class DesertItem
{
 abstract public void getcost();
}
 class dessert extends DesertItem
{ int candy=1;
int cokie=3;
int icecream=1;
	public void getcost()
	{
		 candy= candy+60;
		 cokie= cokie+70;
		  icecream=icecream;
		System.out.print("cost is:"+ (candy+cokie+icecream));
	}
	public void additem()
	{
		System.out.print("all items is added");
	}
	public void order()
	{
		System.out.print("order placed ");
	}
}
 public class shop
 {  
	 public static void main(String arg[])
	 {   String a="owner";
	    
		 dessert obj =new dessert();
		 if(a.equals("owner"))
		 {
			 obj.getcost();
		 }
		 else
			 obj.order();
		 		
	 }
 }