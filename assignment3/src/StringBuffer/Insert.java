package StringBuffer;

public class Insert {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("it is used to _ at the specified index position");
		s.replace(14,15,"insert text");
		System.out.println(s.toString());

	}

}
