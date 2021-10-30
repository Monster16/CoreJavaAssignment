package assignment3_3;

public class Equal {
	public static void main(String[] args) {
		String originalString = "Java String pool refers to collection of Strings which are stored in heap memory";
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		if(originalString == str)
			System.out.println("equal");
		else
			System.out.println("not equal");

	}

}
