package test;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> myhashset = new HashSet<>(6,0.5f);
		myhashset.add(8);
		myhashset.add(7);
		myhashset.add(5);
		myhashset.add(6);
		myhashset.add(9);
		System.out.println(myhashset);
		
		HashSet<String> myhashset1 = new HashSet<>();
		myhashset1.add("hello this is Anil Singh");
		System.out.println(myhashset1);
		boolean isEmpty;
		
	
	}

}
