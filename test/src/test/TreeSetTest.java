package test;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> mytreeset = new TreeSet<>();
		mytreeset.add("item0");
		mytreeset.add("item1");
		mytreeset.add("item2");
		mytreeset.add("item3");
		mytreeset.add("item4");
		mytreeset.add("item5");
		mytreeset.add("item6");
		mytreeset.add("item7");
		mytreeset.add("item8");
		mytreeset.add("item9");
		mytreeset.add("item10");
		mytreeset.add("item11");
		
		//System.out.println(mytreeset);
		
		//duplicate
		//mytreeset.add("item9");
		//System.out.println("After adding duplicate:"+mytreeset); // Duplicate data will get ignored
		
		//size
		//System.out.println(mytreeset.size());
		//subset
		
		SortedSet<String> strset = mytreeset.subSet("item3" , "item8");
		System.out.println(strset);
		//subset navigable
		NavigableSet<String>  ngSet = mytreeset.subSet("item1", true, "item5", true);
		System.out.println(ngSet);
		//isempty
		
		System.out.println(mytreeset.isEmpty());
		System.out.println(mytreeset.contains("item7"));
		System.out.println(mytreeset.first());
		System.out.println(mytreeset.last());
		//remove
		mytreeset.remove("item11");
		System.out.println(mytreeset);
		//Iterate
		System.out.println("Iterate:");
		for(String str : mytreeset)
		{
			System.out.println(str);
		}
		

	}

}


