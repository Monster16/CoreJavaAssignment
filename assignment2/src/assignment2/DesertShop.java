package assignment2;

import java.text.NumberFormat;

public class DesertShop
{
   public static void main( String[] args )
   {
	   
	  
      Candy       item1 = new Candy( "Peanut Butter Fudge", 2.25, 3.99 );
      Cookie      item2 = new Cookie( "Oatmeal Raisin Cookies", 4, 3.99 );
      IceCream    item3 = new IceCream( "Vanilla Ice Cream", 2, 1.05 );
      
      System.out.println( item1 );
      System.out.println( item2 );
      System.out.println( item3 );
   }   
}
abstract class DessertItem {
	  
	   protected String name;
	  
	   public DessertItem() 
	   {
	      this.name = "";
	   }

	   public DessertItem( String name ) 
	   {
	      this.name = name;
	   }

	   public final String getName() 
	   {
	      return name;
	   }

	   public abstract double getCost();
	}

	class Candy extends DessertItem
	{
	   private  double    weight;
	   private  double    pricePerPound;
	   
	   public Candy( String name, double unitWeight, double unitPrice )
	   {
	      super( name );
	      this.weight = unitWeight;
	      this.pricePerPound = unitPrice;
	   }
	   public double getCost()
	   {
	      return( weight * pricePerPound );
	   }

	   public String toString()
	   {
	      NumberFormat   formatter = NumberFormat.getCurrencyInstance();
	      
	      return( name + "\t\t\t" + formatter.format( this.getCost()) + "\n\t" + this.weight + " lbs @ " + formatter.format( this.pricePerPound ));
	   }
	}
	class Cookie extends DessertItem
	{
	   private  double    weight;
	   private  double    pricePerPound;
	   
	   public Cookie( String name, double unitWeight, double unitPrice )
	   {
	      super( name );
	      this.weight = unitWeight;
	      this.pricePerPound = unitPrice;
	   }
	   public double getCost()
	   {
	      return( weight * pricePerPound );
	   }

	   public String toString()
	   {
	      NumberFormat   formatter = NumberFormat.getCurrencyInstance();
	      
	      return( name + "\t\t\t" + formatter.format( this.getCost()) + "\n\t" + this.weight + " lbs @ " + formatter.format( this.pricePerPound ));
	   }
	}
	class IceCream extends DessertItem
	{
	   private  double    weight;
	   private  double    pricePerPound;
	   
	   public IceCream( String name, double unitWeight, double unitPrice )
	   {
	      super( name );
	      this.weight = unitWeight;
	      this.pricePerPound = unitPrice;
	   }
	   public double getCost()
	   {
	      return( weight * pricePerPound );
	   }

	   public String toString()
	   {
	      NumberFormat   formatter = NumberFormat.getCurrencyInstance();
	      
	      return( name + "\t\t\t" + formatter.format( this.getCost()) + "\n\t" + this.weight + " lbs @ " + formatter.format( this.pricePerPound ));
	   }
	}