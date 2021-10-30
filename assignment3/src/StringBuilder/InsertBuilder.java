package StringBuilder;

public class InsertBuilder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("it is used to _ at the specified index position");
		s.replace(14,15,"insert text");
		System.out.println(s.toString());

	}

}
