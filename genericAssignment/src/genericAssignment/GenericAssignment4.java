package genericAssignment;

public class GenericAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair <String, String> obj1 = new Pair<>("1", "Hello");
		Pair <String, java.util.Date> obj2 = new Pair <>("Todays date is:" , new java.util.Date());
		
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		

	}

}


class Pair<K,V>{
	private K Key;
	private V Value;
	public Pair(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	
	public <K,V> String  showData(){
		return Key +" "+Value;
		
		
	}
	
	
}